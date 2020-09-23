package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.ComprobanteFiscalFilter;
import com.prysoft.pdv.models.ComprobanteFiscal;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ComprobanteFiscalService {

    ComprobanteFiscal findById(Long id);

    Page<ComprobanteFiscal> findAll(Pageable page);

    ComprobanteFiscal saveOrUpdate(ComprobanteFiscal entity);

    Page<ComprobanteFiscal> filter(ComprobanteFiscalFilter filter);

    void delete(Long id);
}