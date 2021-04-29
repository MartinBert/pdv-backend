package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.DepositFilter;
import com.prysoft.pdv.models.Deposit;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;

public interface DepositService {

    Deposit findById(Long id);

    Page<Deposit> findAll(Pageable page);

    Deposit saveOrUpdate(Deposit entity);

    Iterable<Deposit> saveAll(ArrayList<Deposit> entity);

    Page<Deposit> filter(DepositFilter filterParam);

    void delete(Long id);
}
