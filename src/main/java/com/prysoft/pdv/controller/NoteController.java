package com.prysoft.pdv.controller;
import com.prysoft.pdv.dto.NoteFilter;
import com.prysoft.pdv.models.Note;
import com.prysoft.pdv.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import java.io.Serializable;

@RestController
@RequestMapping(value = "/{tenantid}/api/notes")
public class NoteController implements Serializable {

    @Autowired
    private NoteService service;

    @GetMapping
    Page<Note> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Note findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Note save(@RequestBody Note entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    Note update(@RequestBody Note entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Note> filter(@RequestBody NoteFilter filterParam) {
        return service.filter(filterParam);
    }
}



