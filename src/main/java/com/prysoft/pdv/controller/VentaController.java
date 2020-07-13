package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.ClienteFilter;
import com.prysoft.pdv.models.Cliente;
import com.prysoft.pdv.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/ventas")
public class VentaController {
    @Autowired
    private ClienteService service;

    @GetMapping
    Page<Cliente> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Cliente findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Cliente save(@RequestBody Cliente entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    Cliente update(@RequestBody Cliente entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Cliente> filter(@RequestBody ClienteFilter filter) {
        return service.filter(filter);
    }
}
