package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.RubroFilter;
import com.prysoft.pdv.models.Rubro;
import com.prysoft.pdv.service.RubroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/{tenantid}/api/rubros")
public class RubroController {
    @Autowired
    private RubroService service;

    @GetMapping
    Page<Rubro> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Rubro findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Rubro save(@RequestBody Rubro entity) {
        return service.saveOrUpdate(entity);
    }

    @PostMapping(value = "/saveAll")
    Iterable<Rubro> saveAll(@RequestBody ArrayList<Rubro> entities) { return service.saveAll(entities); }

    @PutMapping
    Rubro update(@RequestBody Rubro entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Rubro> filter(@RequestBody RubroFilter filterParams) {
        return service.filter(filterParams);
    }
}
