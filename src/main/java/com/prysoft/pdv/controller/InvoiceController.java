package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.InvoiceFilter;
import com.prysoft.pdv.models.Invoice;
import com.prysoft.pdv.service.InvoiceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/{tenantid}/api/comprobantesFiscales")
public class InvoiceController {
    @Autowired
    private InvoiceService service;

    @GetMapping
    Page<Invoice> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Invoice findById(@PathVariable long id) {
        return service.findById(id);
    }

    @GetMapping(value = "cbteNumero/{numero}")
    Invoice findByNumeroCbte(@PathVariable String numero) {return service.findByNumeroCbte(numero);}

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Invoice save(@RequestBody Invoice entity) {
        service.saveOrUpdate(entity);
        Invoice object = service.saveOrUpdate(entity);
        return object ;
    }

    @PostMapping(value = "/saveAll")
    Iterable<Invoice> saveAll(@RequestBody ArrayList<Invoice> entities){ return service.saveOrUpdateAll(entities); }

    @PutMapping
    Invoice update(@RequestBody Invoice entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Invoice> filter(@RequestBody InvoiceFilter filterParam) {
        return service.filter(filterParam);
    }
}
