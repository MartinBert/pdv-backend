package com.prysoft.pdv.controller;


import com.prysoft.pdv.dto.ProductoFilter;
import com.prysoft.pdv.models.*;
import com.prysoft.pdv.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

@RestController
@RequestMapping(value = "/{tenantid}/api/productos")
public class ProductoController {
    @Autowired
    private ProductoService service;

    @GetMapping
    Page<Producto> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Producto findById(@PathVariable long id) {
        return service.findById(id);
    }

    @GetMapping(value = "/codb/{codigoBarra}")
    Producto findByCodigoBarra(@PathVariable String codigoBarra) {
        return service.findByCodigoBarra(codigoBarra);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Producto save(@RequestBody Producto entity) { Producto obj = service.saveOrUpdate(entity);
        return obj;}

    @PostMapping(value = "/filter")
    public Page<Producto> filter(@RequestBody ProductoFilter filter) {
        return service.filter(filter);
    }

    @PostMapping(value = "/saveAll")
    Iterable<Producto> saveAll(@RequestBody ArrayList<Producto> entities) { return service.saveAll(entities); }

    @PutMapping
    Producto update(@RequestBody Producto entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }
}
