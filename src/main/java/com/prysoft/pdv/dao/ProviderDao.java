package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Provider;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderDao extends PagingAndSortingRepository<Provider, Long> {
}
