package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.AttributeFilter;
import com.prysoft.pdv.models.Attribute;
import com.prysoft.pdv.service.AtributoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/{tenantid}/api/atributos")
public class AttributeController {
    @Autowired
    private AtributoService service;

    @GetMapping
    Page<Attribute> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Attribute findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Attribute save(@RequestBody Attribute tentity) {
        return service.saveOrUpdate(tentity);
    }

    @PostMapping(value = "/saveAll")
    Iterable<Attribute> saveAll(@RequestBody ArrayList<Attribute> entities){ return service.saveOrUpdateAll(entities); }

    @PutMapping
    Attribute update(@RequestBody Attribute entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Attribute> filter(@RequestBody AttributeFilter filterParam) {
        return service.filter(filterParam);
    }
}

