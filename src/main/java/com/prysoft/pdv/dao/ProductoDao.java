package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Producto;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProductoDao extends PagingAndSortingRepository<Producto, Long> {
}
