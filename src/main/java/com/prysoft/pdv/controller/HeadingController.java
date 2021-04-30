package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.HeadingFilter;
import com.prysoft.pdv.models.Heading;
import com.prysoft.pdv.service.HeadingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/{tenantid}/api/rubros")
public class HeadingController {
    @Autowired
    private HeadingService service;

    @GetMapping
    Page<Heading> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Heading findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Heading save(@RequestBody Heading entity) {
        return service.saveOrUpdate(entity);
    }

    @PostMapping(value = "/saveAll")
    Iterable<Heading> saveAll(@RequestBody ArrayList<Heading> entities) {
        return service.saveAll(entities);
    }

    @PutMapping
    Heading update(@RequestBody Heading entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Heading> filter(@RequestBody HeadingFilter filterParams) {
        return service.filter(filterParams);
    }
}
