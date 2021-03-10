package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.PropiedadFilter;
import com.prysoft.pdv.models.Propiedad;
import com.prysoft.pdv.service.PropiedadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/propiedades")
public class PropiedadController {
    @Autowired
    private PropiedadService service;

    @GetMapping
    Page<Propiedad> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Propiedad findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Propiedad save(@RequestBody Propiedad entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    Propiedad update(@RequestBody Propiedad entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Propiedad> filter(@RequestBody PropiedadFilter filterParam) {
        return service.filter(filterParam);
    }
}

