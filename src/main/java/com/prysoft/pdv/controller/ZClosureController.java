package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.ZClosureFilter;
import com.prysoft.pdv.models.ZClosure;
import com.prysoft.pdv.service.ZClosureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/{tenantid}/api/cierres_z")
public class ZClosureController {
    @Autowired
    private ZClosureService service;

    @GetMapping
    Page<ZClosure> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    ZClosure findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    ZClosure save(@RequestBody ZClosure tentity) {
        return service.saveOrUpdate(tentity);
    }

    @PostMapping(value = "/saveAll")
    Iterable<ZClosure> saveAll(@RequestBody ArrayList<ZClosure> entities) {
        return service.saveOrUpdateAll(entities);
    }

    @PutMapping
    ZClosure update(@RequestBody ZClosure entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<ZClosure> filter(@RequestBody ZClosureFilter filterParam) {
        return service.filter(filterParam);
    }
}

