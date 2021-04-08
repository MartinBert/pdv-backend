package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.ProductoDao;
import com.prysoft.pdv.dao.SucursalDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.ProductoFilter;
import com.prysoft.pdv.helpers.MathHelper;
import com.prysoft.pdv.models.Producto;
import com.prysoft.pdv.models.Sucursal;
import com.prysoft.pdv.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceContext;
import java.util.*;

@Service
@Transactional
public class ProductoServiceImpl extends FilterService<Producto> implements ProductoService  {

    @Autowired
    private ProductoDao dao;
    @Autowired
    private SucursalDao sucursalDao;
    @Autowired
    private MathHelper mathHelper;

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
    public Page<Producto> filter(ProductoFilter filterParam) {
        List<FilterParam> params = new ArrayList<>();
        String hql;
        if(filterParam.getProductoEstado() > 0){
                hql =
                        "WHERE (c.estado) != 1 " +
                        "AND LOWER(c.nombre) LIKE LOWER('"+filterParam.getProductoName()+"%') " +
                        "AND LOWER(c.codigoBarra) LIKE LOWER('"+filterParam.getProductoCodigoBarras()+"%') " +
                        "AND LOWER(c.codigoProducto) LIKE LOWER('"+filterParam.getProductoCodigo()+"%') " +
                        "AND LOWER(c.marca.nombre) LIKE LOWER('"+filterParam.getProductoMarcaName()+"%')";
        }else{
            if(filterParam.getProductoPrimerAtributoName().isEmpty() &&
                filterParam.getProductoSegundoAtributoName().isEmpty() &&
                filterParam.getProductoTercerAtributoName().isEmpty()){
                hql =
                        "WHERE (c.estado) = 1 " +
                        "AND LOWER(c.nombre) LIKE LOWER('"+filterParam.getProductoName()+"%') " +
                        "AND LOWER(c.codigoBarra) LIKE LOWER('"+filterParam.getProductoCodigoBarras()+"%') " +
                        "AND LOWER(c.codigoProducto) LIKE LOWER('"+filterParam.getProductoCodigo()+"%') " +
                        "AND LOWER(c.marca.nombre) LIKE LOWER('"+filterParam.getProductoMarcaName()+"%')";
            }else{
                hql =
                        "JOIN c.atributos a WHERE LOWER(a.valor) LIKE LOWER('"+filterParam.getProductoPrimerAtributoName()+"%')" +
                        "AND c.estado = 1 " +
                        "AND LOWER(c.nombre) LIKE LOWER('"+filterParam.getProductoName()+"%') " +
                        "AND LOWER(c.codigoBarra) LIKE LOWER('"+filterParam.getProductoCodigoBarras()+"%') " +
                        "AND LOWER(c.codigoProducto) LIKE LOWER('"+filterParam.getProductoCodigo()+"%') " +
                        "AND LOWER(c.marca.nombre) LIKE LOWER('"+filterParam.getProductoMarcaName()+"%')";
            }
        }

        Page<Producto> page = getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
        if(isNotNull(filterParam.getSucursalId())){
            Optional<Sucursal> sucursal = sucursalDao.findById(filterParam.getSucursalId());
            if(sucursal.isPresent()){
                double percentage = sucursal.get().getVariacionGanancia();
                if(isGreaterThanZero(percentage)){
                    for (Producto producto: page.getContent()) {
                        producto.setGanancia(percentage);
                        producto.setPrecioSinIva(getPrecioSinIva(producto));
                        producto.setIvaVenta(getIvaVenta(producto));
                        producto.setPrecioTotal(getPrecioTotal(producto));
                    }
                    return page;
                }
            }
        }
        return page;
    }

    private double getPrecioSinIva(Producto producto) {
        double number = mathHelper.bringAmountPlusPercentage(producto.getCostoBruto(), producto.getGanancia());
        return number;
    }

    private double getIvaVenta(Producto producto){
        double number = mathHelper.bringResultOfPercentageCalcule(producto.getPrecioSinIva(), producto.getIvaVentasObject().getPorcentaje());
        return number;
    }

    private double getPrecioTotal(Producto producto){
        ArrayList<Double> numbers = new ArrayList<>();
        numbers.add(producto.getPrecioSinIva());
        numbers.add(producto.getIvaVenta());
        double number = mathHelper.sumNumbers(numbers);
        return number;
    }

    private boolean isNotNull(Long value){
        if(value != null) return true;
        return false;
    }

    private boolean isGreaterThanZero(double value){
        if(value > 0){
            return true;
        }else{
            return false;
        }
    }
}
