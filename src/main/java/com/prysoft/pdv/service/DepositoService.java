package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.DepositoFilter;
import com.prysoft.pdv.models.Deposito;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DepositoService {

    Deposito findById(Long id);

    Page<Deposito> findAll(Pageable page);

    Deposito saveOrUpdate(Deposito entity);

    Page<Deposito> filter(DepositoFilter filter);

    void delete(Long id);
}
