package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.PlanPagoFilter;
import com.prysoft.pdv.models.PlanPago;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PlanPagoService {

    PlanPago findById(Long id);

    Page<PlanPago> findAll(Pageable page);

    PlanPago saveOrUpdate(PlanPago entity);

    Page<PlanPago> filter(PlanPagoFilter filter);

    void delete(Long id);

}