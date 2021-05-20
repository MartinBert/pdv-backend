package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.ProfileFilter;
import com.prysoft.pdv.models.Profile;
import com.prysoft.pdv.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/perfiles")
public class ProfileController {
    @Autowired
    private ProfileService service;

    @GetMapping
    Page<Profile> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Profile findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Profile save(@RequestBody Profile entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    Profile update(@RequestBody Profile entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Profile> filter(@RequestBody ProfileFilter filterParam) {
        return service.filter(filterParam);
    }
}
