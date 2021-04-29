package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.PropertyFilter;
import com.prysoft.pdv.models.Property;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PropertyService {

    Property findById(Long id);

    Page<Property> findAll(Pageable page);

    Property saveOrUpdate(Property entity);

    void delete(Long id);

    Page<Property> filter(PropertyFilter filterParam);
}
