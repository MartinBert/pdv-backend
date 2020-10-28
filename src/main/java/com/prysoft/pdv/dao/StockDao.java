package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Stock;
import com.prysoft.pdv.models.Sucursal;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.Optional;

public interface StockDao extends PagingAndSortingRepository<Stock, Long> {
    Optional<Stock> findByAlgorim(String algorim);

    Iterable<Stock> findBySucursal(Sucursal sucursal);

    Optional<Stock> findByProductoId(Long p);
}
