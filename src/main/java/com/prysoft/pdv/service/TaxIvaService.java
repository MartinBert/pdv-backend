package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.TaxIvaFilter;
import com.prysoft.pdv.models.TaxIva;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TaxIvaService {
    TaxIva findById(Long id);

    Page<TaxIva> findAll(Pageable page);

    TaxIva saveOrUpdate(TaxIva entity);

    void delete(Long id);

    Page<TaxIva> filter(TaxIvaFilter filterParam);
}
