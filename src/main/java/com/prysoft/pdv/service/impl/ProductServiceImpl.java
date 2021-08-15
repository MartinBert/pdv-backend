package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.ProductDao;
import com.prysoft.pdv.dao.CommercialBranchDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.ProductFilter;
import com.prysoft.pdv.helpers.MathHelper;
import com.prysoft.pdv.models.Product;
import com.prysoft.pdv.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ProductServiceImpl extends FilterService<Product> implements ProductService {

    @Autowired
    private ProductDao dao;
    @Autowired
    private CommercialBranchDao commercialBranchDao;
    @Autowired
    private MathHelper mathHelper;

    @Override
    public Product findById(Long id) {
        Optional<Product> optional = dao.findById(id);
        if (optional.isEmpty()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public Product findByCodigoBarra(String codigoBarra) {
        try {
            Optional<Product> optional = dao.findByCodigoBarra(codigoBarra);
            return optional.get();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Page<Product> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Product saveOrUpdate(Product entity) {
        return dao.save(entity);
    }

    @Override
    public Iterable<Product> saveOrUpdateAll(ArrayList<Product> entities) {
        Iterable<Product> productos = dao.findAll();
        productos.forEach((Product el) -> {
            entities.forEach((Product e) -> {
                if (el.getCodigoBarra().equals(e.getCodigoBarra())) {
                    e.setId(el.getId());
                }
            });
        });
        return dao.saveAll(entities);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    @Transient
    public Page<Product> filter(ProductFilter filterParam) {
        List<FilterParam> params = new ArrayList<>();
        String hql;
        if (filterParam.getProductoEstado() != 1) {
            hql =
                    "WHERE (c.estado)d != 1 " +
                            "AND LOWER(c.nombre) LIKE LOWER('" + filterParam.getProductoName() + "%') " +
                            "AND LOWER(c.codigoBarra) LIKE LOWER('" + filterParam.getProductoCodigoBarras() + "%') " +
                            "AND LOWER(c.codigoProducto) LIKE LOWER('" + filterParam.getProductoCodigo() + "%') " +
                            "AND LOWER(c.marca.nombre) LIKE LOWER('" + filterParam.getProductoMarcaName() + "%')";
        } else {
            if (filterParam.getProductoPrimerAtributoName().isEmpty() &&
                    filterParam.getProductoSegundoAtributoName().isEmpty() &&
                    filterParam.getProductoTercerAtributoName().isEmpty()) {
                hql =
                        "WHERE (c.estado) = 1 " +
                                "AND LOWER(c.nombre) LIKE LOWER('" + filterParam.getProductoName() + "%') " +
                                "AND LOWER(c.codigoBarra) LIKE LOWER('" + filterParam.getProductoCodigoBarras() + "%') " +
                                "AND LOWER(c.codigoProducto) LIKE LOWER('" + filterParam.getProductoCodigo() + "%') " +
                                "AND LOWER(c.marca.nombre) LIKE LOWER('" + filterParam.getProductoMarcaName() + "%')";
            } else {
                hql =
                        "JOIN c.atributos a WHERE LOWER(a.valor) LIKE LOWER('" + filterParam.getProductoPrimerAtributoName() + "%')" +
                                "AND c.estado = 1 " +
                                "AND LOWER(c.nombre) LIKE LOWER('" + filterParam.getProductoName() + "%') " +
                                "AND LOWER(c.codigoBarra) LIKE LOWER('" + filterParam.getProductoCodigoBarras() + "%') " +
                                "AND LOWER(c.codigoProducto) LIKE LOWER('" + filterParam.getProductoCodigo() + "%') " +
                                "AND LOWER(c.marca.nombre) LIKE LOWER('" + filterParam.getProductoMarcaName() + "%')";
            }
        }
        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }
}
