package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.PropertyFilter;
import com.prysoft.pdv.models.Property;
import com.prysoft.pdv.service.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/propiedades")
public class PropertyController {

    @Autowired
    private PropertyService service;

    @GetMapping
    Page<Property> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Property findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Property save(@RequestBody Property entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    Property update(@RequestBody Property entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Property> filter(@RequestBody PropertyFilter filterParam) {
        return service.filter(filterParam);
    }
}

