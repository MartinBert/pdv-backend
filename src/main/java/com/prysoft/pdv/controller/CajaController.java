package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.Caja;
import com.prysoft.pdv.models.ComprobanteFiscal;
import com.prysoft.pdv.service.CajaService;
import com.prysoft.pdv.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/{tenantid}/api/caja")
public class CajaController {
    @Autowired
    private CajaService service;
    @Autowired
    private VentaService salesService;

    @GetMapping
    Page<Caja> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Caja findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Caja save(@RequestBody Caja entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    Caja update(@RequestBody Caja entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Caja> filter(@RequestBody GenericFilter filterParam) {
        return service.filter(filterParam);
    }

    @PostMapping(value = "/filterNotCloseReceipts")
    public ArrayList<ComprobanteFiscal> filterNotCloseReceipts(@RequestBody GenericFilter filterParam) {
        System.out.println(filterParam);
        return salesService.filterNotCloseReceipts(filterParam);
    }
}
