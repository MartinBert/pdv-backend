package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.BusinessFilter;
import com.prysoft.pdv.models.Business;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface BusinessService {

    Business findById(Long id);

    Page<Business> findAll(Pageable page);

    Business saveOrUpdate(Business entity);

    Page<Business> filter(BusinessFilter filterParam);

    void delete(Long id);
}
