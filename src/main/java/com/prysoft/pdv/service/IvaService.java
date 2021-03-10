package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.IvaFilter;
import com.prysoft.pdv.models.Iva;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IvaService {
    Iva findById(Long id);

    Page<Iva> findAll(Pageable page);

    Iva saveOrUpdate(Iva entity);

    void delete(Long id);

    Page<Iva> filter(IvaFilter filterParam);
}
