package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.NoteFilter;
import com.prysoft.pdv.models.Note;
import com.prysoft.pdv.models.Print;
import com.prysoft.pdv.service.PrintService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping(value = "/{tenantid}/api/impresoras")
public class PrintController {
    @Autowired
    private PrintService service;

    @GetMapping
    Page<Print> findAll(Pageable page) {
        return service.findAll(page);
    }

    //@GetMapping(value = "/{id}")
    //Print findById(@PathVariable long id) {
       // return service.findById(id);
    //}

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Note save(@RequestBody Print entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    Note update(@RequestBody Print entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Print> filter(@RequestBody NoteFilter filterParam) {
        return service.filter(filterParam);
    }

}
