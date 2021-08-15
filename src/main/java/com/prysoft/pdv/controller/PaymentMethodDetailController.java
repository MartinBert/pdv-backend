package com.prysoft.pdv.controller;

import com.prysoft.pdv.models.PaymentMethodDetail;
import com.prysoft.pdv.service.PaymentMethodDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping(value = "/{tenantid}/api/mediosPagoDetalle")
public class PaymentMethodDetailController {
    @Autowired
    private PaymentMethodDetailService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    PaymentMethodDetail save(@RequestBody PaymentMethodDetail entity) {
        return service.saveOrUpdate(entity);
    }
}
