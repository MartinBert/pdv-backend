package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.ComprobanteFiscalFilter;
import com.prysoft.pdv.models.ComprobanteFiscal;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;

public interface ComprobanteFiscalService {

    ComprobanteFiscal findById(Long id);

    ComprobanteFiscal findByNumeroCbte(String numero);

    Page<ComprobanteFiscal> findAll(Pageable page);

    ComprobanteFiscal saveOrUpdate(ComprobanteFiscal entity);

    Page<ComprobanteFiscal> filter(ComprobanteFiscalFilter filterParam);

    void delete(Long id);

    Iterable<ComprobanteFiscal> saveOrUpdateAll(ArrayList<ComprobanteFiscal> entities);
}
