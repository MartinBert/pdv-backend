package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.DistribuidorFilter;
import com.prysoft.pdv.dto.MarcaFilter;
import com.prysoft.pdv.models.Distribuidor;
import com.prysoft.pdv.models.Marca;
import com.prysoft.pdv.service.DistribuidorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/distribuidores")
public class DistribuidorController {
    @Autowired
    private DistribuidorService service;

    @GetMapping
    Page<Distribuidor> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Distribuidor findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Distribuidor save(@RequestBody Distribuidor entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    Distribuidor update(@RequestBody Distribuidor entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Distribuidor> filter(@RequestBody DistribuidorFilter filter) {
        return service.filter(filter);
    }
}
