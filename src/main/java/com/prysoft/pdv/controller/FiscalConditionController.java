package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.FiscalConditionFilter;
import com.prysoft.pdv.models.FiscalCondition;
import com.prysoft.pdv.service.FiscalConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/condicionesFiscales")
public class FiscalConditionController {
    @Autowired
    private FiscalConditionService service;

    @GetMapping
    Page<FiscalCondition> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    FiscalCondition findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    FiscalCondition save(@RequestBody FiscalCondition entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    FiscalCondition update(@RequestBody FiscalCondition entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<FiscalCondition> filter(@RequestBody FiscalConditionFilter filterParam) {
        return service.filter(filterParam);
    }
}

