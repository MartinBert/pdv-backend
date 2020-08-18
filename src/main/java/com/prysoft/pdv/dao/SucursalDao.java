package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Sucursal;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SucursalDao extends PagingAndSortingRepository<Sucursal, Long> {
}
