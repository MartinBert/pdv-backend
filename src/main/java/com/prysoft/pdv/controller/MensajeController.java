package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.MensajeFilter;
import com.prysoft.pdv.models.Message;
import com.prysoft.pdv.service.MensajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/mensajes")
public class MensajeController {
    @Autowired
    private MensajeService service;

    @GetMapping
    Page<Message> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Message findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Message save(@RequestBody Message entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    Message update(@RequestBody Message entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Message> filter(@RequestBody MensajeFilter filterParam) {
        return service.filter(filterParam);
    }
}
