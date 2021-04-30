package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.DepositFilter;
import com.prysoft.pdv.models.Deposit;
import com.prysoft.pdv.service.DepositService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/{tenantid}/api/depositos")
public class DepositController {
    @Autowired
    private DepositService service;

    @GetMapping
    Page<Deposit> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Deposit findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Deposit save(@RequestBody Deposit entity) {
        return service.saveOrUpdate(entity);
    }

    @PostMapping(value = "/saveAll")
    Iterable<Deposit> saveAll(@RequestBody ArrayList<Deposit> entities) {
        return service.saveAll(entities);
    }

    @PutMapping
    Deposit update(@RequestBody Deposit entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Deposit> filter(@RequestBody DepositFilter filterParam) {
        return service.filter(filterParam);
    }
}
