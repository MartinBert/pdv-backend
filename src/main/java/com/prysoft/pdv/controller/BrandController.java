package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.MarcaFilter;
import com.prysoft.pdv.models.Brand;
import com.prysoft.pdv.service.BrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/{tenantid}/api/marcas")
public class BrandController {
    @Autowired
    private BrandService service;

    @GetMapping
    Page<Brand> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Brand findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Brand save(@RequestBody Brand entity) {
        return service.saveOrUpdate(entity);
    }

    @PostMapping(value = "/saveAll")
    Iterable<Brand> saveAll(@RequestBody ArrayList<Brand> entities) { return service.saveAll(entities); }

    @PutMapping
    Brand update(@RequestBody Brand entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Brand> filter(@RequestBody MarcaFilter filterParam) {
        return service.filter(filterParam);
    }
}
