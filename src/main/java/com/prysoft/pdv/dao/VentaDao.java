package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Venta;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface VentaDao extends PagingAndSortingRepository<Venta, Long> {
}
