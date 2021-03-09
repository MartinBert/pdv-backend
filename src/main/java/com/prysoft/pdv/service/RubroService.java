package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.RubroFilter;
import com.prysoft.pdv.models.Rubro;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;

public interface RubroService {
    Rubro findById(Long id);

    Page<Rubro> findAll(Pageable page);

    Rubro saveOrUpdate(Rubro entity);

    Page<Rubro> filter(RubroFilter filterParams);

    Iterable<Rubro> saveAll(ArrayList<Rubro> entities);

    void delete(Long id);
}
