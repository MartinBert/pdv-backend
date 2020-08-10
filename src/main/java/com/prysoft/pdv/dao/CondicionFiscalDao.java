package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.CondicionFiscal;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CondicionFiscalDao extends PagingAndSortingRepository<CondicionFiscal, Long> {
}
