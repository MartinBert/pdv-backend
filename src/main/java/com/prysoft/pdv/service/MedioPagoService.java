package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.MedioPagoFilter;
import com.prysoft.pdv.models.MedioPago;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MedioPagoService {

    MedioPago findById(Long id);

    Page<MedioPago> findAll(Pageable page);

    MedioPago saveOrUpdate(MedioPago entity);

    Page<MedioPago> filter(MedioPagoFilter filter);

    void delete(Long id);

}