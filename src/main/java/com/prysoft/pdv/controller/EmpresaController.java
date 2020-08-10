package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.EmpresaFilter;
import com.prysoft.pdv.models.Empresa;
import com.prysoft.pdv.service.EmpresaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/{tenantid}/api/empresas")
public class EmpresaController {
    @Autowired
    private EmpresaService service;

    @GetMapping
    Page<Empresa> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Empresa findById(@PathVariable long id) {
        return service.findById(id);
    }

    @GetMapping(value = "/conditions")
    List<Object> findAllCondition() {return service.findAllCondition();}

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Empresa save(@RequestBody Empresa entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    Empresa update(@RequestBody Empresa entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Empresa> filter(@RequestBody EmpresaFilter filter) {
        return service.filter(filter);
    }
}
