package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.Iva;
import com.prysoft.pdv.service.IvaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/ivas")
public class IvaController {
    @Autowired
    private IvaService service;

    @GetMapping
    Page<Iva> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Iva findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Iva save(@RequestBody Iva entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    Iva update(@RequestBody Iva entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Iva> filter(@RequestBody GenericFilter filterParam) {
        return service.filter(filterParam);
    }
}
