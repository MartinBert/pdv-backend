package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.PreguntaFrecuenteFilter;
import com.prysoft.pdv.models.PreguntaFrecuente;
import com.prysoft.pdv.service.PreguntaFrecuenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/preguntasFrecuentes")
public class PreguntaFrecuenteController {
    @Autowired
    private PreguntaFrecuenteService service;

    @GetMapping
    Page<PreguntaFrecuente> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    PreguntaFrecuente findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    PreguntaFrecuente save(@RequestBody PreguntaFrecuente entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    PreguntaFrecuente update(@RequestBody PreguntaFrecuente entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<PreguntaFrecuente> filter(@RequestBody PreguntaFrecuenteFilter filterParam) {
        return service.filter(filterParam);
    }
}
