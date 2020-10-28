package com.prysoft.pdv.service;

import com.prysoft.pdv.models.Devolucion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DevolucionService {

    Devolucion findById(Long id);

    Page<Devolucion> findAll(Pageable page);

    Devolucion saveOrUpdate(Devolucion entity);

    Page<Devolucion> filter(Long filter, int page, int size);

    void delete(Long id);
}
