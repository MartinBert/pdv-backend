package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.SalePointFilter;
import com.prysoft.pdv.models.SalePoint;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SalePointService {

    SalePoint findById(Long id);

    Page<SalePoint> findAll(Pageable page);

    SalePoint saveOrUpdate(SalePoint entity);

    Page<SalePoint> filter(SalePointFilter filterParam);

    void delete(Long id);
}
