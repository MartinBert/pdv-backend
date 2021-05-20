package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.StockMovementHistoryFilter;
import com.prysoft.pdv.models.StockMovementHistory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface StockMovementHistoryService {
    StockMovementHistory findById(Long id);

    Page<StockMovementHistory> findAll(Pageable page);

    StockMovementHistory saveOrUpdate(StockMovementHistory entity);

    void delete(Long id);

    Page<StockMovementHistory> filter(StockMovementHistoryFilter filterParam);
}
