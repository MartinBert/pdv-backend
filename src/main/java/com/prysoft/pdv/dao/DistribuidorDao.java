package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Distribuidor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DistribuidorDao extends PagingAndSortingRepository<Distribuidor, Long> {
}
