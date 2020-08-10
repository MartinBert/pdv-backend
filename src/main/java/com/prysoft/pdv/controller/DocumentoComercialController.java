package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.DocumentoComercialFilter;
import com.prysoft.pdv.models.DocumentoComercial;
import com.prysoft.pdv.models.Producto;
import com.prysoft.pdv.service.DocumentoComercialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/{tenantid}/api/documentosComerciales")
public class DocumentoComercialController {
    @Autowired
    private DocumentoComercialService service;

    @GetMapping
    Page<DocumentoComercial> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    DocumentoComercial findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    DocumentoComercial save(@RequestBody DocumentoComercial entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    DocumentoComercial update(@RequestBody DocumentoComercial entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<DocumentoComercial> filter(@RequestBody DocumentoComercialFilter filter) {
        return service.filter(filter);
    }

    @PostMapping(value = "/saveAll")
    Iterable<DocumentoComercial> saveAll(@RequestBody ArrayList<DocumentoComercial> entities) {
        return  service.saveAll(entities);
    }
}


