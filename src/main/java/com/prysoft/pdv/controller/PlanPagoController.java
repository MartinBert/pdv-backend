package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.PlanPagoFilter;
import com.prysoft.pdv.models.Deposito;
import com.prysoft.pdv.models.PlanPago;
import com.prysoft.pdv.service.PlanPagoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/{tenantid}/api/planesPago")
public class PlanPagoController {
    @Autowired
    private PlanPagoService service;

    @GetMapping
    Page<PlanPago> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    PlanPago findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    PlanPago save(@RequestBody PlanPago entity) {
        return service.saveOrUpdate(entity);
    }

    @PostMapping(value = "/saveAll")
    Iterable<PlanPago> saveAll(@RequestBody ArrayList<PlanPago> entities) { return service.saveAll(entities); }

    @PutMapping
    PlanPago update(@RequestBody PlanPago entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<PlanPago> filter(@RequestBody PlanPagoFilter filter) {
        return service.filter(filter);
    }

    @GetMapping(value = "/getForSucursal/{id}/{page}/{size}")
    Page<PlanPago> getPlansForSucursal(@PathVariable String id, @PathVariable int page, @PathVariable int size)
    {return service.filterPlans(id, page, size);}
}
