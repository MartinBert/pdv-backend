package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.CondicionFiscal;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CondicionFiscalService {

    CondicionFiscal findById(Long id);

    Page<CondicionFiscal> findAll(Pageable page);

    CondicionFiscal saveOrUpdate(CondicionFiscal entity);

    Page<CondicionFiscal> filter(GenericFilter filterParam);

    void delete(Long id);
}
