package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.MedioPagoFilter;
import com.prysoft.pdv.models.MedioPago;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;

public interface MedioPagoService {

    MedioPago findById(Long id);

    Page<MedioPago> findAll(Pageable page);

    MedioPago saveOrUpdate(MedioPago entity);

    Iterable<MedioPago> saveAll(ArrayList<MedioPago> entities);

    Page<MedioPago> filter(MedioPagoFilter filterParam);

    void delete(Long id);

}