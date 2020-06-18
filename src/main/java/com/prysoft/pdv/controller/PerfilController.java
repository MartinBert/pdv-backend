package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.MarcaFilter;
import com.prysoft.pdv.dto.PerfilFilter;
import com.prysoft.pdv.models.Marca;
import com.prysoft.pdv.models.Perfil;
import com.prysoft.pdv.service.PerfilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/perfiles")
public class PerfilController {
    @Autowired
    private PerfilService service;

    @GetMapping
    Page<Perfil> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Perfil findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Perfil save(@RequestBody Perfil entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    Perfil update(@RequestBody Perfil entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Perfil> filter(@RequestBody PerfilFilter filter) {
        return service.filter(filter);
    }
}
