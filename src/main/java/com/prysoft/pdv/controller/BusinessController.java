package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.BusinessFilter;
import com.prysoft.pdv.models.Business;
import com.prysoft.pdv.service.BusinessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/empresas")
public class BusinessController {
    @Autowired
    private BusinessService service;

    @GetMapping
    Page<Business> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Business findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Business save(@RequestBody Business entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    Business update(@RequestBody Business entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Business> filter(@RequestBody BusinessFilter filterParam) {
        return service.filter(filterParam);
    }
}