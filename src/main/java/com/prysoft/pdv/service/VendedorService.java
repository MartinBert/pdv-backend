package com.prysoft.pdv.service;

import com.prysoft.pdv.models.Vendedor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface VendedorService {

    Vendedor findById(Long id);

    Page<Vendedor> findAll(Pageable page);

    Vendedor saveOrUpdate(Vendedor entity);

    Page<Vendedor> filter(Long filter, int page, int size);

    void delete(Long id);
}
