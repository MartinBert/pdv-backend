package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Proveedor;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DistribuidorDao extends PagingAndSortingRepository<Proveedor, Long> {
}
