package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.SalePointFilter;
import com.prysoft.pdv.models.SalePoint;
import com.prysoft.pdv.service.SalePointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/punto_ventas")
public class SalePointController {
    @Autowired
    private SalePointService service;

    @GetMapping
    Page<SalePoint> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    SalePoint findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    SalePoint save(@RequestBody SalePoint entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    SalePoint update(@RequestBody SalePoint entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<SalePoint> filter(@RequestBody SalePointFilter filterParam) {
        return service.filter(filterParam);
    }
}
