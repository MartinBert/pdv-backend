package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.Proveedor;
import com.prysoft.pdv.service.DistribuidorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/distribuidores")
public class DistribuidorController {
    @Autowired
    private DistribuidorService service;

    @GetMapping
    Page<Proveedor> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Proveedor findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Proveedor save(@RequestBody Proveedor entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    Proveedor update(@RequestBody Proveedor entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Proveedor> filter(@RequestBody GenericFilter filterParam) {
        return service.filter(filterParam);
    }
}
