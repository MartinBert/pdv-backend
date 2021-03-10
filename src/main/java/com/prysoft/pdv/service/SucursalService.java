package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.SucursalFilter;
import com.prysoft.pdv.models.Sucursal;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SucursalService {

    Sucursal findById(Long id);

    Page<Sucursal> findAll(Pageable page);

    Sucursal saveOrUpdate(Sucursal entity);

    Page<Sucursal> filter(SucursalFilter filterParam);

    void delete(Long id);
}
