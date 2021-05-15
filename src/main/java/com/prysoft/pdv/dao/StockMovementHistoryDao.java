package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.StockMovementHistory;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StockMovementHistoryDao extends PagingAndSortingRepository<StockMovementHistory, Long> {
}
