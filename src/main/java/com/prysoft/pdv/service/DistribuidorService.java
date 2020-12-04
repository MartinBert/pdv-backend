package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.Proveedor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DistribuidorService {

    Proveedor findById(Long id);

    Page<Proveedor> findAll(Pageable page);

    Proveedor saveOrUpdate(Proveedor entity);

    Page<Proveedor> filter(GenericFilter filterParam);

    void delete(Long id);
}
