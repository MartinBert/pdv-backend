package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.FiscalCondition;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FiscalConditionDao extends PagingAndSortingRepository<FiscalCondition, Long> {
}
