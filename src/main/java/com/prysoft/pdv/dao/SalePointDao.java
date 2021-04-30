package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.SalePoint;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalePointDao extends PagingAndSortingRepository<SalePoint, Long> {
}
