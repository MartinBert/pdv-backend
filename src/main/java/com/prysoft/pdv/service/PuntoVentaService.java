package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.PuntoVenta;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PuntoVentaService {

    PuntoVenta findById(Long id);

    Page<PuntoVenta> findAll(Pageable page);

    PuntoVenta saveOrUpdate(PuntoVenta entity);

    Page<PuntoVenta> filter(GenericFilter filterParam);

    void delete(Long id);
}
