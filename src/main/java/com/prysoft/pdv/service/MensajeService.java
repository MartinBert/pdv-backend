package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.MensajeFilter;
import com.prysoft.pdv.models.Mensaje;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MensajeService {
    Mensaje findById(Long id);

    Page<Mensaje> findAll(Pageable page);

    Mensaje saveOrUpdate(Mensaje entity);

    void delete(Long id);

    Page<Mensaje> filter(MensajeFilter filterParam);
}
