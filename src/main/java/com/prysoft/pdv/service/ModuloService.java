package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.Modulo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ModuloService {
    Modulo findById(Long id);

    Page<Modulo> findAll(Pageable page);

    Modulo saveOrUpdate(Modulo entity);

    void delete(Long id);

    Page<Modulo> filter(GenericFilter filterParam);
}
