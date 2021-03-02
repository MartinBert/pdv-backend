package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.ProductoDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.Producto;
import com.prysoft.pdv.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.*;

@Service
@Transactional
public class ProductoServiceImpl extends FilterService<Producto> implements ProductoService  {

    @Autowired
    private ProductoDao dao;

    @Override
    public Producto findById(Long id) {
        Optional<Producto> optional = dao.findById(id);
        if(optional.isEmpty()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
    public Producto findByCodigoBarra(String codigoBarra) {
        try{
            Optional<Producto> optional = dao.findByCodigoBarra(codigoBarra);
            return optional.get();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Page<Producto> findAll(Pageable page) {return dao.findAll(page);}

    @Override
    public Producto saveOrUpdate(Producto entity) {
        return dao.save(entity);
    }

    @Override
    public Iterable<Producto> saveOrUpdateAll(ArrayList<Producto> entities) {
        Iterable<Producto> productos = dao.findAll();
        productos.forEach((Producto el) -> {
            entities.forEach((Producto e) -> {
                if(el.getCodigoBarra().equals(e.getCodigoBarra())){
                    e.setId(el.getId());
                    System.out.println("Sel");
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
    public Page<Producto> filter(GenericFilter filterParam) {
        List<FilterParam> params = new ArrayList<>();
        String hql;
        if(filterParam.getLongParam() != null){
            if(filterParam.getIdParam() != 999999999){
                hql = "JOIN c.distribuidores d WHERE (d.id) = ('"+filterParam.getIdParam()+"')";
            }else{
                hql = "";
            }
        }else{
            if(filterParam.getDoubleParam() > 0){
                    hql = "WHERE (c.estado) != 1 " +
                    "AND (LOWER(c.nombre) LIKE LOWER('"+filterParam.getStringParam()+"%') " +
                    "OR LOWER(c.codigoBarra) LIKE LOWER('"+filterParam.getStringParam()+"%') " +
                    "OR LOWER(c.codigoProducto) LIKE LOWER('"+filterParam.getStringParam()+"%')) " +
                    "AND LOWER(c.marca.nombre) LIKE LOWER('"+filterParam.getThirdStringParam()+"%')";
                    }else{
                    hql = "WHERE (c.estado) = 1 " +
                    "AND (LOWER(c.nombre) LIKE LOWER('"+filterParam.getStringParam()+"%') " +
                    "OR LOWER(c.codigoBarra) LIKE LOWER('"+filterParam.getStringParam()+"%') " +
                    "OR LOWER(c.codigoProducto) LIKE LOWER('"+filterParam.getStringParam()+"%')) " +
                    "AND LOWER(c.marca.nombre) LIKE LOWER('"+filterParam.getThirdStringParam()+"%')";
            }
        }

        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }
}
