package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.CommercialDocumentFilter;
import com.prysoft.pdv.models.CommercialDocument;
import com.prysoft.pdv.service.CommercialDocumentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/{tenantid}/api/documentosComerciales")
public class CommercialDocumentController {
    @Autowired
    private CommercialDocumentService service;

    @GetMapping
    Page<CommercialDocument> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    CommercialDocument findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    CommercialDocument save(@RequestBody CommercialDocument entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    CommercialDocument update(@RequestBody CommercialDocument entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<CommercialDocument> filter(@RequestBody CommercialDocumentFilter filterParam) {
        return service.filter(filterParam);
    }

    @PostMapping(value = "/saveAll")
    Iterable<CommercialDocument> saveAll(@RequestBody ArrayList<CommercialDocument> entities) {
        return service.saveAll(entities);
    }

    @GetMapping(value = "/invoices")
    Iterable<CommercialDocument> getInvoices() {
        return service.getInvoices();
    }
}


