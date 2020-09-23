package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.SucursalFilter;
import com.prysoft.pdv.models.Sucursal;
import com.prysoft.pdv.service.SucursalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/sucursales")
public class SucursalController {
    @Autowired
    private SucursalService service;

    @GetMapping
    Page<Sucursal> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Sucursal findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Sucursal save(@RequestBody Sucursal entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    Sucursal update(@RequestBody Sucursal entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Sucursal> filter(@RequestBody SucursalFilter filter) {
        return service.filter(filter);
    }
}