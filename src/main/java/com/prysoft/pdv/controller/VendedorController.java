package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.Cliente;
import com.prysoft.pdv.models.Vendedor;
import com.prysoft.pdv.service.VendedorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/vendedores")
public class VendedorController {
    @Autowired
    private VendedorService service;

    @GetMapping
    Page<Vendedor> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Vendedor findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Vendedor save(@RequestBody Vendedor entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    Vendedor update(@RequestBody Vendedor entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Vendedor> filter(@RequestBody GenericFilter filterParam) {
        return service.filter(filterParam);
    }
}
