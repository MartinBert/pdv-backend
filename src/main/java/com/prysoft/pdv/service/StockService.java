package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.StockFilter;
import com.prysoft.pdv.models.Stock;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public interface StockService {
    Stock findById(Long id);

    Optional<Stock> findByAlgorim(Long sucursalId, String algorim);

    Optional<Stock> findByProductCodeBarInDefaultDeposit(String codeBar, Long sucursalId);

    List<Stock> findByProductCodeBarInAnyDeposit(String codeBar, Long sucursalId);

    Page<Stock> findAll(Pageable page);

    Stock save(Stock entity);

    Stock update(Stock entity);

    Iterable<Stock> saveAll(ArrayList<Stock> entities);

    Page<Stock> filter(StockFilter filterParam);

    Page<Stock> filterStockForDepositId(StockFilter filterParam);

    void delete(Long id);
}
