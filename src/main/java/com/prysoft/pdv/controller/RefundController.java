package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.RefundFilter;
import com.prysoft.pdv.models.Refund;
import com.prysoft.pdv.service.RefundService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/devoluciones")
public class RefundController {
    @Autowired
    private RefundService service;

    @GetMapping
    Page<Refund> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Refund findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Refund save(@RequestBody Refund entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    Refund update(@RequestBody Refund entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    Page<Refund> filter(@RequestBody RefundFilter filterParam) {
        return service.filter(filterParam);}
}
