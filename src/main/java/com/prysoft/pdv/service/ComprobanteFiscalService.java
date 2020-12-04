package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.ComprobanteFiscal;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ComprobanteFiscalService {

    ComprobanteFiscal findById(Long id);

    ComprobanteFiscal findByNumeroCbte(String numero);

    Page<ComprobanteFiscal> findAll(Pageable page);

    ComprobanteFiscal saveOrUpdate(ComprobanteFiscal entity);

    Page<ComprobanteFiscal> filter(GenericFilter filterParam);

    void delete(Long id);
}
