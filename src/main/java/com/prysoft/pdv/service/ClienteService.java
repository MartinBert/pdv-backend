package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.ClienteFilter;
import com.prysoft.pdv.models.Cliente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ClienteService {

    Cliente findById(Long id);

    Page<Cliente> findAll(Pageable page);

    Cliente saveOrUpdate(Cliente entity);

    Page<Cliente> filter(ClienteFilter filter);

    void delete(Long id);
}