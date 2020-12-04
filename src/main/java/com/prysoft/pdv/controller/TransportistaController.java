package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.Cliente;
import com.prysoft.pdv.models.Transportista;
import com.prysoft.pdv.service.TransportistaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/transportistas")
public class TransportistaController {
    @Autowired
    private TransportistaService service;

    @GetMapping
    Page<Transportista> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Transportista findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Transportista save(@RequestBody Transportista entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    Transportista update(@RequestBody Transportista entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Transportista> filter(@RequestBody GenericFilter filterParam) {
        return service.filter(filterParam);
    }
}
