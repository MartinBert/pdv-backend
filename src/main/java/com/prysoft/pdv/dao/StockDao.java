package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Stock;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface StockDao extends PagingAndSortingRepository<Stock, Long> {
    Optional<Stock> findByAlgorim(String algorim);
}
