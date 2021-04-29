package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Client;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientDao extends PagingAndSortingRepository<Client, Long> {
}

