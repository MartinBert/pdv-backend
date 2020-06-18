package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.RubroFilter;
import com.prysoft.pdv.models.Rubro;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface RubroService {
    Rubro findById(Long id);

    Page<Rubro> findAll(Pageable page);

    Rubro saveOrUpdate(Rubro entity);

    Page<Rubro> filter(RubroFilter filter);

    void delete(Long id);
}
