package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Refund;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RefundDao extends PagingAndSortingRepository<Refund, Long> {
}

