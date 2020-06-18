package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.DistribuidorFilter;
import com.prysoft.pdv.models.Distribuidor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DistribuidorService {

    Distribuidor findById(Long id);

    Page<Distribuidor> findAll(Pageable page);

    Distribuidor saveOrUpdate(Distribuidor entity);

    Page<Distribuidor> filter(DistribuidorFilter filter);

    void delete(Long id);
}
