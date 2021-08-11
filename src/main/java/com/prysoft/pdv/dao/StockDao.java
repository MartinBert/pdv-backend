package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.CommercialBranch;
import com.prysoft.pdv.models.Stock;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.List;
import java.util.Optional;

public interface StockDao extends PagingAndSortingRepository<Stock, Long> {
    Optional<Stock> findByAlgorim(String algorim);

    Iterable<Stock> findBySucursal(CommercialBranch sucursal);

    Optional<Stock> findByProductoId(Long p);

    Optional<Stock> findByProductoCodigoBarraAndSucursalIdAndDepositoDefaultDeposit(String codeBar, Long sucursalId, String defaultDeposit);

    List<Stock> findByProductoCodigoBarraAndSucursalId(String codeBar, Long sucursalId);
}
