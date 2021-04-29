package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.CashBoxFilter;
import com.prysoft.pdv.dto.VentaFilter;
import com.prysoft.pdv.models.CashBox;
import com.prysoft.pdv.models.ComprobanteFiscal;
import com.prysoft.pdv.service.CashBoxService;
import com.prysoft.pdv.service.VentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/{tenantid}/api/caja")
public class CashBoxController {
    @Autowired
    private CashBoxService service;
    @Autowired
    private VentaService salesService;

    @GetMapping
    Page<CashBox> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    CashBox findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    CashBox save(@RequestBody CashBox entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    CashBox update(@RequestBody CashBox entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<CashBox> filter(@RequestBody CashBoxFilter filterParam) {
        return service.filter(filterParam);
    }

    @PostMapping(value = "/filterNotCloseReceipts")
    public ArrayList<ComprobanteFiscal> filterNotCloseReceipts(@RequestBody VentaFilter filterParam) {
        return salesService.filterNotCloseReceipts(filterParam);
    }
}
