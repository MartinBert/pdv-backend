package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.VentaFilter;
import com.prysoft.pdv.models.Venta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface VentaService {

    Venta findById(Long id);

    Page<Venta> findAll(Pageable page);

    Venta saveOrUpdate(Venta entity);

    Page<Venta> filter(VentaFilter filter);

    void delete(Long id);
}

