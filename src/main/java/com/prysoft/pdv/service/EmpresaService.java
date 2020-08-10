package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.EmpresaFilter;
import com.prysoft.pdv.models.Empresa;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface EmpresaService {

    Empresa findById(Long id);

    Page<Empresa> findAll(Pageable page);

    List<Object> findAllCondition();

    Empresa saveOrUpdate(Empresa entity);

    Page<Empresa> filter(EmpresaFilter filter);

    void delete(Long id);
}
