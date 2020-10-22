package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.StockFilter;
import com.prysoft.pdv.models.Stock;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;

public interface StockService {
    Stock findById(Long id);

    Page<Stock> findAll(Pageable page);

    Stock saveOrUpdate(Stock entity);

    Iterable<Stock> saveAll(ArrayList<Stock> entities);

    Page<Stock> filter(StockFilter filter, int page, int size);

    void delete(Long id);
}
