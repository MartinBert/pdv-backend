package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.MedioPagoFilter;
import com.prysoft.pdv.models.MedioPago;
import com.prysoft.pdv.models.PlanPago;
import com.prysoft.pdv.models.Producto;
import com.prysoft.pdv.service.MedioPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/{tenantid}/api/mediosPago")
public class MedioPagoController {
    @Autowired
    private MedioPagoService service;

    @GetMapping
    Page<MedioPago> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    MedioPago findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    MedioPago save(@RequestBody MedioPago entity) {
        return service.saveOrUpdate(entity);
    }

    @PostMapping(value = "/saveAll")
    Iterable<MedioPago> saveAll(@RequestBody ArrayList<MedioPago> entities) { return service.saveAll(entities); }

    @PutMapping
    MedioPago update(@RequestBody MedioPago entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<MedioPago> filter(@RequestBody MedioPagoFilter filter) {
        return service.filter(filter);
    }

    @GetMapping(value = "/getForSucursal/{id}/{page}/{size}")
    Page<MedioPago> getMediosForSucursal(@PathVariable String id, @PathVariable int page, @PathVariable int size)
    {return service.filterMedios(id, page, size);}
}
