package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.MarcaFilter;
import com.prysoft.pdv.models.Marca;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MarcaService {
    Marca findById(Long id);

    Page<Marca> findAll(Pageable page);

    Marca saveOrUpdate(Marca entity);

    Page<Marca> filter(MarcaFilter filter);

    void delete(Long id);
}
