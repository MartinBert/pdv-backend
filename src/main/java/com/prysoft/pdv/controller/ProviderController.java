package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.ProviderFilter;
import com.prysoft.pdv.models.Provider;
import com.prysoft.pdv.service.ProviderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/distribuidores")
public class ProviderController {
    @Autowired
    private ProviderService service;

    @GetMapping
    Page<Provider> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Provider findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Provider save(@RequestBody Provider entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    Provider update(@RequestBody Provider entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Provider> filter(@RequestBody ProviderFilter filterParam) {
        return service.filter(filterParam);
    }
}
