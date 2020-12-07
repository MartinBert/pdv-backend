package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.Mensaje;
import com.prysoft.pdv.service.MensajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/mensajes")
public class MensajeController {
    @Autowired
    private MensajeService service;

    @GetMapping
    Page<Mensaje> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Mensaje findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Mensaje save(@RequestBody Mensaje entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    Mensaje update(@RequestBody Mensaje entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Mensaje> filter(@RequestBody GenericFilter filterParam) {
        return service.filter(filterParam);
    }
}
