package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.CarrierFilter;
import com.prysoft.pdv.models.Carrier;
import com.prysoft.pdv.service.CarrierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/transportistas")
public class CarrierController {
    @Autowired
    private CarrierService service;

    @GetMapping
    Page<Carrier> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Carrier findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Carrier save(@RequestBody Carrier entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    Carrier update(@RequestBody Carrier entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Carrier> filter(@RequestBody CarrierFilter filterParam) {
        return service.filter(filterParam);
    }
}
