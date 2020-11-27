package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.CondicionFiscal;
import com.prysoft.pdv.service.CondicionFiscalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/condicionesFiscales")
public class CondicionFiscalController {
    @Autowired
    private CondicionFiscalService service;

    @GetMapping
    Page<CondicionFiscal> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    CondicionFiscal findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    CondicionFiscal save(@RequestBody CondicionFiscal entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    CondicionFiscal update(@RequestBody CondicionFiscal entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<CondicionFiscal> filter(@RequestBody GenericFilter filterParam) {
        return service.filter(filterParam);
    }
}

