package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.CommercialBranchFilter;
import com.prysoft.pdv.models.CommercialBranch;
import com.prysoft.pdv.service.CommercialBranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/sucursales")
public class CommercialBranchController {
    @Autowired
    private CommercialBranchService service;

    @GetMapping
    Page<CommercialBranch> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    CommercialBranch findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    CommercialBranch save(@RequestBody CommercialBranch entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    CommercialBranch update(@RequestBody CommercialBranch entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<CommercialBranch> filter(@RequestBody CommercialBranchFilter filterParam) {
        return service.filter(filterParam);
    }

}
