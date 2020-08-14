package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.PuntoVenta;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PuntoVentaDao extends PagingAndSortingRepository<PuntoVenta, Long> {
}
