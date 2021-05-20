package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.ModuleFilter;
import com.prysoft.pdv.models.Module;
import com.prysoft.pdv.service.ModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/modulos")
public class ModuleController {
    @Autowired
    private ModuleService service;

    @GetMapping
    Page<Module> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Module findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Module save(@RequestBody Module entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    Module update(@RequestBody Module entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Module> filter(@RequestBody ModuleFilter filterParam) {
        return service.filter(filterParam);
    }
}
