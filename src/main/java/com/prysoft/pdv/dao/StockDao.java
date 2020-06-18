package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Stock;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface StockDao extends PagingAndSortingRepository<Stock, Long> {
}
