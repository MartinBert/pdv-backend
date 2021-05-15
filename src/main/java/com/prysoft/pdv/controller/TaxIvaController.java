package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.TaxIvaFilter;
import com.prysoft.pdv.models.TaxIva;
import com.prysoft.pdv.service.TaxIvaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/ivas")
public class TaxIvaController {
    @Autowired
    private TaxIvaService service;

    @GetMapping
    Page<TaxIva> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    TaxIva findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    TaxIva save(@RequestBody TaxIva entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    TaxIva update(@RequestBody TaxIva entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<TaxIva> filter(@RequestBody TaxIvaFilter filterParam) {
        return service.filter(filterParam);
    }
}
