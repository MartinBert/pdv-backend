package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.Deposito;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;

public interface DepositoService {

    Deposito findById(Long id);

    Page<Deposito> findAll(Pageable page);

    Deposito saveOrUpdate(Deposito entity);

    Iterable<Deposito> saveAll(ArrayList<Deposito> entity);

    Page<Deposito> filter(GenericFilter filterParam);

    void delete(Long id);
}
