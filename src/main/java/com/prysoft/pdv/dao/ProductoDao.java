package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Producto;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.ArrayList;
import java.util.Optional;

public interface ProductoDao extends PagingAndSortingRepository<Producto, Long> {
    Optional<Producto> findByCodigoBarra(String codigoBarra);
}
