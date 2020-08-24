package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.PlanPagoFilter;
import com.prysoft.pdv.models.Marca;
import com.prysoft.pdv.models.PlanPago;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;

public interface PlanPagoService {

    PlanPago findById(Long id);

    Page<PlanPago> findAll(Pageable page);

    PlanPago saveOrUpdate(PlanPago entity);

    Iterable<PlanPago> saveAll(ArrayList<PlanPago> entities);

    Page<PlanPago> filter(PlanPagoFilter filter);

    void delete(Long id);

}