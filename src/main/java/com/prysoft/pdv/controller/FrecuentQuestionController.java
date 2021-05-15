package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.FrecuentQuestionFilter;
import com.prysoft.pdv.models.FrecuentQuestion;
import com.prysoft.pdv.service.FrecuentQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/preguntasFrecuentes")
public class FrecuentQuestionController {
    @Autowired
    private FrecuentQuestionService service;

    @GetMapping
    Page<FrecuentQuestion> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    FrecuentQuestion findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    FrecuentQuestion save(@RequestBody FrecuentQuestion entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    FrecuentQuestion update(@RequestBody FrecuentQuestion entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<FrecuentQuestion> filter(@RequestBody FrecuentQuestionFilter filterParam) {
        return service.filter(filterParam);
    }
}
