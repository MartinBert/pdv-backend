package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.PuntoVentaFilter;
import com.prysoft.pdv.models.PuntoVenta;
import com.prysoft.pdv.service.PuntoVentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/punto_ventas")
public class PuntoVentaController {
    @Autowired
    private PuntoVentaService service;

    @GetMapping
    Page<PuntoVenta> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    PuntoVenta findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    PuntoVenta save(@RequestBody PuntoVenta entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    PuntoVenta update(@RequestBody PuntoVenta entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<PuntoVenta> filter(@RequestBody PuntoVentaFilter filter) {
        return service.filter(filter);
    }
}
