package com.prysoft.pdv.controller;

import com.prysoft.pdv.models.Cliente;
import com.prysoft.pdv.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/clientes")
public class ClienteController {
    @Autowired
    private ClienteService service;

    @GetMapping
    Page<Cliente> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Cliente findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Cliente save(@RequestBody Cliente entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    Cliente update(@RequestBody Cliente entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping(value = "/getForSucursal/{filter}/{page}/{size}")
    Page<Cliente> getClientesForSucursal(@PathVariable Long filter, @PathVariable int page, @PathVariable int size) {return service.filter(filter,page,size);}
}
