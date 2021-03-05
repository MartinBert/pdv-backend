package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.StockDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.Stock;
import com.prysoft.pdv.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StockServiceImpl extends FilterService<Stock> implements StockService {
    @Autowired
    private StockDao dao;

    @Override
    public Stock findById(Long id) {
        Optional<Stock> optional = dao.findById(id);
        if(optional.isEmpty()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
    public Page<Stock> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Stock save(Stock entity){
        return dao.save(entity);
    }

    @Override
    public Stock update(Stock entity) {
        Optional<Stock> obj = dao.findByAlgorim(entity.getAlgorim());
        if(obj.isPresent()){
            dao.delete(entity);
            entity.setCantidad(entity.getCantidad() + obj.get().getCantidad());
            entity.setId(obj.get().getId());
            dao.save(entity);
        } else {
            dao.save(entity);
        }
        return null;
    }

    @Override
    public Iterable<Stock> saveAll(ArrayList<Stock> entities) {

        for (Stock stock: entities){
           Optional<Stock> obj = dao.findByAlgorim(stock.getAlgorim());
           if(obj.isPresent()){
               stock.setId(obj.get().getId());
               stock.setCantidad(stock.getCantidad() + obj.get().getCantidad());
               dao.save(stock);
           }else{
               dao.save(stock);
           }
        }

        return null;
    }

    @Override
    public Page<Stock> filter(GenericFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        if(filterParam.getThirdLongParam() == null){
            hql = "WHERE LOWER(c.producto.nombre) LIKE LOWER('"+filterParam.getStringParam()+"%') " +
                    "AND LOWER(c.producto.marca.nombre) LIKE LOWER('"+filterParam.getThirdStringParam()+"%')";
        }else{
            hql = "WHERE (c.sucursal.id) = ('"+filterParam.getThirdLongParam()+"') " +
                    "AND (LOWER(c.producto.nombre) LIKE LOWER('"+filterParam.getStringParam()+"%') " +
                    "OR LOWER(c.producto.codigoBarra) LIKE LOWER('"+filterParam.getStringParam()+"%') " +
                    "OR LOWER(c.producto.codigoProducto) LIKE LOWER('"+filterParam.getStringParam()+"%')) " +
                    "AND LOWER(c.producto.marca.nombre) LIKE LOWER('"+filterParam.getThirdStringParam()+"%')";
        }

        return getPage(hql , filterParam.getPage() - 1, filterParam.getSize(), params);
    }

    @Override
    public Page<Stock> filterStockForDepositId(GenericFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        if(filterParam.getThirdLongParam() == null){
            hql = "WHERE (c.deposito.id) = ('"+filterParam.getSecondLongParam()+"') AND LOWER(c.producto.nombre) LIKE LOWER('"+filterParam.getStringParam()+"%') " +
                    "AND LOWER(c.producto.marca.nombre) LIKE LOWER('"+filterParam.getThirdStringParam()+"%')";
        }else{
            hql = "WHERE (c.sucursal.id) = ('"+filterParam.getThirdLongParam()+"') " +
                    "AND (c.deposito.id) = ('"+filterParam.getSecondLongParam()+"') " +
                    "AND (LOWER(c.producto.nombre) LIKE LOWER('"+filterParam.getStringParam()+"%') " +
                    "OR LOWER(c.producto.codigoBarra) LIKE LOWER('"+filterParam.getStringParam()+"%') " +
                    "OR LOWER(c.producto.codigoProducto) LIKE LOWER('"+filterParam.getStringParam()+"%')) " +
                    "AND LOWER(c.producto.marca.nombre) LIKE LOWER('"+filterParam.getThirdStringParam()+"%')";
        }

        return getPage(hql , filterParam.getPage() - 1, filterParam.getSize(), params);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

}
