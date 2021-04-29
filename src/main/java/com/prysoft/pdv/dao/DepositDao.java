package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Deposit;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepositDao extends PagingAndSortingRepository<Deposit, Long> {
}

