package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.HistorialMovimientosStock;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistorialMovimientosStockDao extends PagingAndSortingRepository<HistorialMovimientosStock, Long> {
}
