package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.CashBoxFilter;
import com.prysoft.pdv.dto.SaleFilter;
import com.prysoft.pdv.models.CashBox;
import com.prysoft.pdv.models.Invoice;
import com.prysoft.pdv.service.CashBoxService;
import com.prysoft.pdv.service.SaleService;
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
    private SaleService salesService;

    @GetMapping
    Page<CashBox> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    CashBox findById(@PathVariable long id) {
        return service.findById(id);
    }

    @GetMapping(value = "/correlative/{sucursalId}")
    int findLastNumeroCorrelativo(@PathVariable Long sucursalId) {
        return service.findLastBySucursalId(sucursalId);
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
    public ArrayList<Invoice> filterNotCloseReceipts(@RequestBody SaleFilter filterParam) {
        return salesService.filterNotCloseReceipts(filterParam);
    }
}
