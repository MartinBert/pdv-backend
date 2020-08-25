package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.DepositoFilter;
import com.prysoft.pdv.models.Deposito;
import com.prysoft.pdv.service.DepositoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/{tenantid}/api/depositos")
public class DepositoController {
    @Autowired
    private DepositoService service;

    @GetMapping
    Page<Deposito> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Deposito findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Deposito save(@RequestBody Deposito entity) {
        return service.saveOrUpdate(entity);
    }

    @PostMapping(value = "/saveAll")
    Iterable<Deposito> saveAll(@RequestBody ArrayList<Deposito> entities) { return service.saveAll(entities); }

    @PutMapping
    Deposito update(@RequestBody Deposito entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Deposito> filter(@RequestBody DepositoFilter filter) {
        return service.filter(filter);
    }
}
