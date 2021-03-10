package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.PropiedadFilter;
import com.prysoft.pdv.models.Propiedad;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PropiedadService {

    Propiedad findById(Long id);

    Page<Propiedad> findAll(Pageable page);

    Propiedad saveOrUpdate(Propiedad entity);

    void delete(Long id);

    Page<Propiedad> filter(PropiedadFilter filterParam);
}
