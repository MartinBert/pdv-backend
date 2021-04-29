package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.ClientFilter;
import com.prysoft.pdv.models.Client;
import com.prysoft.pdv.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/clientes")
public class ClientController {
    @Autowired
    private ClientService service;

    @GetMapping
    Page<Client> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Client findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Client save(@RequestBody Client entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    Client update(@RequestBody Client entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Client> filter(@RequestBody ClientFilter filterParam) {
        return service.filter(filterParam);
    }
}
