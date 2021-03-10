package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.ComprobanteFiscalFilter;
import com.prysoft.pdv.models.ComprobanteFiscal;
import com.prysoft.pdv.service.ComprobanteFiscalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/{tenantid}/api/comprobantesFiscales")
public class ComprobanteFiscalController {
    @Autowired
    private ComprobanteFiscalService service;

    @GetMapping
    Page<ComprobanteFiscal> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    ComprobanteFiscal findById(@PathVariable long id) {
        return service.findById(id);
    }

    @GetMapping(value = "cbteNumero/{numero}")
    ComprobanteFiscal findByNumeroCbte(@PathVariable String numero) {return service.findByNumeroCbte(numero);}

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    ComprobanteFiscal save(@RequestBody ComprobanteFiscal entity) {
        service.saveOrUpdate(entity);
        ComprobanteFiscal object = service.saveOrUpdate(entity);
        return object ;
    }

    @PostMapping(value = "/saveAll")
    Iterable<ComprobanteFiscal> saveAll(@RequestBody ArrayList<ComprobanteFiscal> entities){ return service.saveOrUpdateAll(entities); }

    @PutMapping
    ComprobanteFiscal update(@RequestBody ComprobanteFiscal entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<ComprobanteFiscal> filter(@RequestBody ComprobanteFiscalFilter filterParam) {
        return service.filter(filterParam);
    }
}
