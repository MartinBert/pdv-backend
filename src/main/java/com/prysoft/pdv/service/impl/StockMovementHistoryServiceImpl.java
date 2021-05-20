package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.StockMovementHistoryDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.StockMovementHistoryFilter;
import com.prysoft.pdv.models.StockMovementHistory;
import com.prysoft.pdv.service.StockMovementHistoryService;
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
public class StockMovementHistoryServiceImpl extends FilterService<StockMovementHistory> implements StockMovementHistoryService {

    @Autowired
    private StockMovementHistoryDao dao;

    @Override
    public StockMovementHistory findById(Long id) {
        Optional<StockMovementHistory> optional = dao.findById(id);
        if (!optional.isPresent()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public Page<StockMovementHistory> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public StockMovementHistory saveOrUpdate(StockMovementHistory entity) {
        return dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<StockMovementHistory> filter(StockMovementHistoryFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        if (filterParam.getSucursalId() == null) {
            hql =
                    "WHERE LOWER(c.descripcion) LIKE LOWER('" + filterParam.getHistorialMovimientosStockDescripcion() + "%') " +
                            "AND LOWER(c.fecha) LIKE LOWER('" + filterParam.getHistorialMovimientosStockFecha() + "%') " +
                            "AND LOWER(c.usuario) LIKE LOWER('" + filterParam.getHistorialMovimientosStockUsuario() + "%') ";
        } else {
            hql =
                    "WHERE (c.sucursal.id) = ('" + filterParam.getSucursalId() + "') " +
                            "AND LOWER(c.descripcion) LIKE LOWER('" + filterParam.getHistorialMovimientosStockDescripcion() + "%') " +
                            "AND LOWER(c.fecha) LIKE LOWER('" + filterParam.getHistorialMovimientosStockFecha() + "%') " +
                            "AND LOWER(c.usuario) LIKE LOWER('" + filterParam.getHistorialMovimientosStockUsuario() + "%') " +
                            "GROUP BY (c.id) ORDER BY (c.id) DESC";
        }
        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }

}
