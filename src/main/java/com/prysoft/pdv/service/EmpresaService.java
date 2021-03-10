package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.EmpresaFilter;
import com.prysoft.pdv.models.Empresa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmpresaService {

    Empresa findById(Long id);

    Page<Empresa> findAll(Pageable page);

    Empresa saveOrUpdate(Empresa entity);

    Page<Empresa> filter(EmpresaFilter filterParam);

    void delete(Long id);
}
