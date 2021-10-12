package com.prysoft.pdv.controller;


import com.prysoft.pdv.dto.PrintFilter;
import com.prysoft.pdv.models.Print;
import com.prysoft.pdv.service.PrintService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;


@RestController
@RequestMapping(value = "/{tenantid}/api/impresoras")
public class PrintController implements Serializable {

    @Autowired
    private PrintService service;

    @GetMapping
    Page<Print> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Print findById(@PathVariable long id) {
       return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Print save(@RequestBody Print entity) {
        return service.saveOrUpdate(entity);
    }

    @PostMapping(value = "/saveAll")
    @ResponseStatus(HttpStatus.CREATED)
    Iterable<Print> saveAll(@RequestBody Iterable<Print> entities) {
        return service.saveAll(entities);
    }

    @PutMapping
    Print update(@RequestBody Print entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Print> filter(@RequestBody PrintFilter filterParam) {
        return service.filter(filterParam);
    }

}
