package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.CashBox;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CashBoxDao extends PagingAndSortingRepository<CashBox, Long> {
    Optional<CashBox> findLastBySucursalId(Long sucursalId);
}
