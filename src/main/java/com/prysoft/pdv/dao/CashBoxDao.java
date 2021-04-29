package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.CashBox;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CashBoxDao extends PagingAndSortingRepository<CashBox, Long> {
}
