package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.Atributo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;

public interface AtributoService {
    Atributo findById(Long id);

    Page<Atributo> findAll(Pageable page);

    Atributo saveOrUpdate(Atributo entity);

    void delete(Long id);

    Iterable<Atributo> saveOrUpdateAll(ArrayList<Atributo> entities);

    Page<Atributo> filter(GenericFilter filterParam);
}
