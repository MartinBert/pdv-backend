package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Cliente;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ClienteDao extends PagingAndSortingRepository<Cliente, Long> {
}

