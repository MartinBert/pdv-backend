package com.prysoft.pdv.controller;

import com.prysoft.pdv.models.Devolucion;
import com.prysoft.pdv.service.DevolucionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/devoluciones")
public class DevolucionController {
    @Autowired
    private DevolucionService service;

    @GetMapping
    Page<Devolucion> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Devolucion findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Devolucion save(@RequestBody Devolucion entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    Devolucion update(@RequestBody Devolucion entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping(value = "/getForSucursal/{page}/{size}/{filter}")
    Page<Devolucion> getStockForSucursal(@PathVariable Long filter, @PathVariable int page, @PathVariable int size) {return service.filter(filter,page,size);}
}
