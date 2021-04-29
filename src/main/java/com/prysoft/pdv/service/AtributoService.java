package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.AttributeFilter;
import com.prysoft.pdv.models.Attribute;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;

public interface AtributoService {
    Attribute findById(Long id);

    Page<Attribute> findAll(Pageable page);

    Attribute saveOrUpdate(Attribute entity);

    void delete(Long id);

    Iterable<Attribute> saveOrUpdateAll(ArrayList<Attribute> entities);

    Page<Attribute> filter(AttributeFilter filterParam);
}
