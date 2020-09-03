package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Cliente;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteDao extends PagingAndSortingRepository<Cliente, Long> {
}

