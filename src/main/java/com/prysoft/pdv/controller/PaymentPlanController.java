package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.PaymentPlanFilter;
import com.prysoft.pdv.models.PaymentPlan;
import com.prysoft.pdv.service.PaymentPlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/{tenantid}/api/planesPago")
public class PaymentPlanController {
    @Autowired
    private PaymentPlanService service;

    @GetMapping
    Page<PaymentPlan> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    PaymentPlan findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    PaymentPlan save(@RequestBody PaymentPlan entity) {
        return service.saveOrUpdate(entity);
    }

    @PostMapping(value = "/saveAll")
    Iterable<PaymentPlan> saveAll(@RequestBody ArrayList<PaymentPlan> entities) {
        return service.saveAll(entities);
    }

    @PutMapping
    PaymentPlan update(@RequestBody PaymentPlan entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<PaymentPlan> filter(@RequestBody PaymentPlanFilter filterParam) {
        return service.filter(filterParam);
    }
}
