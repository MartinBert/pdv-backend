package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.Atributo;
import com.prysoft.pdv.service.AtributoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/{tenantid}/api/atributos")
public class AtributoController {
    @Autowired
    private AtributoService service;

    @GetMapping
    Page<Atributo> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Atributo findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Atributo save(@RequestBody Atributo entity) {
        return service.saveOrUpdate(entity);
    }

    @PostMapping(value = "/saveAll")
    Iterable<Atributo> saveAll(@RequestBody ArrayList<Atributo> entities){ return service.saveOrUpdateAll(entities); }

    @PutMapping
    Atributo update(@RequestBody Atributo entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Atributo> filter(@RequestBody GenericFilter filterParam) {
        return service.filter(filterParam);
    }
}

