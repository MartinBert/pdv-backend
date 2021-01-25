package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.HistorialMovimientosStock;
import com.prysoft.pdv.service.HistorialMovimientosStockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/historialStock")
public class HistorialMovimientosStockController {
    @Autowired
    private HistorialMovimientosStockService service;

    @GetMapping
    Page<HistorialMovimientosStock> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    HistorialMovimientosStock findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    HistorialMovimientosStock save(@RequestBody HistorialMovimientosStock entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    HistorialMovimientosStock update(@RequestBody HistorialMovimientosStock entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<HistorialMovimientosStock> filter(@RequestBody GenericFilter filterParam) {
        return service.filter(filterParam);
    }
}
