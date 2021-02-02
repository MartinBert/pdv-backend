package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.HistorialMovimientosStockDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.HistorialMovimientosStock;
import com.prysoft.pdv.service.HistorialMovimientosStockService;
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
public class HistorialMovimientosStockServiceImpl extends FilterService<HistorialMovimientosStock> implements HistorialMovimientosStockService {

    @Autowired
    private HistorialMovimientosStockDao dao;

    @Override
    public HistorialMovimientosStock findById(Long id) {
        Optional<HistorialMovimientosStock> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
    public Page<HistorialMovimientosStock> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public HistorialMovimientosStock saveOrUpdate(HistorialMovimientosStock entity) {return dao.save(entity);}

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<HistorialMovimientosStock> filter(GenericFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();

        if(filterParam.getIdSucursal() == null){
            hql = "WHERE LOWER(c.descripcion) LIKE LOWER('"+filterParam.getStringParam()+"%') OR LOWER(c.fecha) = LOWER('"+filterParam.getStringParam()+"')";
        }else{
            hql =
                "WHERE (c.sucursal.id) = ('"+filterParam.getIdSucursal()+"') GROUP BY (c.id) ORDER BY (c.id) DESC";
        }

        return getPage(hql, filterParam.getPage(), filterParam.getSize(), params);
    }

}
