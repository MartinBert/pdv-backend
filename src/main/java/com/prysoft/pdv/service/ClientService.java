package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.ClientFilter;
import com.prysoft.pdv.models.Client;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ClientService {

    Client findById(Long id);

    Page<Client> findAll(Pageable page);

    Client saveOrUpdate(Client entity);

    void delete(Long id);

    Page<Client> filter(ClientFilter filterParam);
}
