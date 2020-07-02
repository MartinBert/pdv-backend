package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.CondicionIvaFilter;
import com.prysoft.pdv.models.CondicionIva;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CondicionIvaService {

    CondicionIva findById(Long id);

    Page<CondicionIva> findAll(Pageable page);

    CondicionIva saveOrUpdate(CondicionIva entity);

    Page<CondicionIva> filter(CondicionIvaFilter filter);

    void delete(Long id);
}
