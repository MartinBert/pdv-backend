package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.VendedorFilter;
import com.prysoft.pdv.models.Vendedor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface VendedorService {

    Vendedor findById(Long id);

    Page<Vendedor> findAll(Pageable page);

    Vendedor saveOrUpdate(Vendedor entity);

    Page<Vendedor> filter(VendedorFilter filter);

    void delete(Long id);
}
