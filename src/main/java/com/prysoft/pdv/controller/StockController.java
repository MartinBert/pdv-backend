package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.StockFilter;
import com.prysoft.pdv.models.Producto;
import com.prysoft.pdv.models.Stock;
import com.prysoft.pdv.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/{tenantid}/api/stock")
public class StockController {
    @Autowired
    private StockService service;


    @GetMapping
    Page<Stock> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Stock findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Stock save(@RequestBody Stock entity) {
        return service.saveOrUpdate(entity);
    }

    @PostMapping(value = "/getForSucursal/{page}/{size}")
    Page<Stock> getStockForSucursal(@RequestBody StockFilter filter, @PathVariable int page, @PathVariable int size)
    {return service.filter(filter,page,size);}

    @PostMapping(value = "/saveAll")
    Iterable<Stock> saveAll(@RequestBody ArrayList<Stock> entities) {
        return  service.saveAll(entities);
    }

    @PutMapping
    Stock update(@RequestBody Stock entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }
}