package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.MarcaFilter;
import com.prysoft.pdv.models.Marca;
import com.prysoft.pdv.service.MarcaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/marcas")
public class MarcaController {
    @Autowired
    private MarcaService service;

    @GetMapping
    Page<Marca> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Marca findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Marca save(@RequestBody Marca entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    Marca update(@RequestBody Marca entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Marca> filter(@RequestBody MarcaFilter filter) {
        return service.filter(filter);
    }
}
