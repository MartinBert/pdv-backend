package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Vendedor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface VendedorDao extends PagingAndSortingRepository<Vendedor, Long> {
}

