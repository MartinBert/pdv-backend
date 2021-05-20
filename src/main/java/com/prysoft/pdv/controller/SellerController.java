package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.SellerFilter;
import com.prysoft.pdv.models.Seller;
import com.prysoft.pdv.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/vendedores")
public class SellerController {
    @Autowired
    private SellerService service;

    @GetMapping
    Page<Seller> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Seller findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Seller save(@RequestBody Seller entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    Seller update(@RequestBody Seller entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Seller> filter(@RequestBody SellerFilter filterParam) {
        return service.filter(filterParam);
    }
}
