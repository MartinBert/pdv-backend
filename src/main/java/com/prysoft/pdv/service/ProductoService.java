package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.ProductoFilter;
import com.prysoft.pdv.models.Producto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;

public interface ProductoService {
    Producto findById(Long id);

    Producto findByCodigoBarra(String codigoBarra);

    Page<Producto> findAll(Pageable page);

    Producto saveOrUpdate(Producto entity);

    Iterable<Producto> saveOrUpdateAll(ArrayList<Producto> entities);

    Page<Producto> filter(ProductoFilter filterParam);

    void delete(Long id);
}
