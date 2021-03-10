package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.CajaFilter;
import com.prysoft.pdv.models.Caja;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CajaService {
    Caja findById(Long id);

    Page<Caja> findAll(Pageable page);

    Caja saveOrUpdate(Caja entity);

    void delete(Long id);

    Page<Caja> filter(CajaFilter filterParam);
}
