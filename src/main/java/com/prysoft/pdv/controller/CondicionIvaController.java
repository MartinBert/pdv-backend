package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.CondicionIvaFilter;
import com.prysoft.pdv.models.CondicionIva;
import com.prysoft.pdv.service.CondicionIvaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/condiciones-iva")
public class CondicionIvaController {
    @Autowired
    private CondicionIvaService service;

    @GetMapping
    Page<CondicionIva> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    CondicionIva findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    CondicionIva save(@RequestBody CondicionIva entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    CondicionIva update(@RequestBody CondicionIva entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<CondicionIva> filter(@RequestBody CondicionIvaFilter filter) {
        return service.filter(filter);
    }
}

