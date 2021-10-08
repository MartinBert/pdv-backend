package com.prysoft.pdv.service;


import com.prysoft.pdv.dto.PrintFilter;
import com.prysoft.pdv.models.Print;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PrintService {

    Print findById(Long id);

    Page<Print> findAll(Pageable page);

    Print saveOrUpdate(Print entity);

    Iterable<Print> saveAll(Iterable<Print> entities);

    void delete(Long id);

    Page<Print> filter(PrintFilter filterParam);
}