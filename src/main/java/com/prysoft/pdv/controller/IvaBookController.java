package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.IvaBookFilter;
import com.prysoft.pdv.models.Invoice;
import com.prysoft.pdv.service.IvaBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/librosDeIva")
public class IvaBookController {

    @Autowired
    private IvaBookService service;

    @PostMapping("/filter")
    Page<Invoice> filter(@RequestBody IvaBookFilter filterParams) {
        return service.filter(filterParams);
    }
}
