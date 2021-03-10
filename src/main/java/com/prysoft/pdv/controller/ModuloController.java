package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.ModuloFilter;
import com.prysoft.pdv.models.Modulo;
import com.prysoft.pdv.service.ModuloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/modulos")
public class ModuloController {
    @Autowired
    private ModuloService service;

    @GetMapping
    Page<Modulo> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Modulo findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Modulo save(@RequestBody Modulo entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    Modulo update(@RequestBody Modulo entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Modulo> filter(@RequestBody ModuloFilter filterParam) {
        return service.filter(filterParam);
    }
}
