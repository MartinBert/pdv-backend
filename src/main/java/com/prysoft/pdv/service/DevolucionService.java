package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.Devolucion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DevolucionService {

    Devolucion findById(Long id);

    Page<Devolucion> findAll(Pageable page);

    Devolucion saveOrUpdate(Devolucion entity);

    Page<Devolucion> filter(GenericFilter filterParam);

    void delete(Long id);
}
