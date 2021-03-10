package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.HistorialMovimientosStockFilter;
import com.prysoft.pdv.models.HistorialMovimientosStock;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface HistorialMovimientosStockService {
    HistorialMovimientosStock findById(Long id);

    Page<HistorialMovimientosStock> findAll(Pageable page);

    HistorialMovimientosStock saveOrUpdate(HistorialMovimientosStock entity);

    void delete(Long id);

    Page<HistorialMovimientosStock> filter(HistorialMovimientosStockFilter filterParam);
}
