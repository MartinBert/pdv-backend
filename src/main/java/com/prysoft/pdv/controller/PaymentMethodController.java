package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.PaymentMethodFilter;
import com.prysoft.pdv.models.PaymentMethod;
import com.prysoft.pdv.models.PaymentMethodDetail;
import com.prysoft.pdv.service.PaymentMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/{tenantid}/api/mediosPago")
public class PaymentMethodController {
    @Autowired
    private PaymentMethodService service;

    @GetMapping
    Page<PaymentMethod> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    PaymentMethod findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    PaymentMethod save(@RequestBody PaymentMethod entity) {
        return service.saveOrUpdate(entity);
    }

    @PostMapping(value = "/saveAll")
    Iterable<PaymentMethod> saveAll(@RequestBody ArrayList<PaymentMethod> entities) {
        return service.saveAll(entities);
    }

    @PutMapping
    PaymentMethod update(@RequestBody PaymentMethod entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<PaymentMethod> filter(@RequestBody PaymentMethodFilter filterParam) {
        return service.filter(filterParam);
    }

    @PostMapping(value="/getCuentacorrientes")
    public Page<PaymentMethod> getCuentascorrientes (@RequestBody PaymentMethodFilter filterParam){
        return service.getCuentascorrientes(filterParam);
    }
}
