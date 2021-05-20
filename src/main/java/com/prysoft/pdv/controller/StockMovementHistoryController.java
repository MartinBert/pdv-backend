package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.StockMovementHistoryFilter;
import com.prysoft.pdv.models.StockMovementHistory;
import com.prysoft.pdv.service.StockMovementHistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/{tenantid}/api/historialStock")
public class StockMovementHistoryController {
    @Autowired
    private StockMovementHistoryService service;

    @GetMapping
    Page<StockMovementHistory> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    StockMovementHistory findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    StockMovementHistory save(@RequestBody StockMovementHistory entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    StockMovementHistory update(@RequestBody StockMovementHistory entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<StockMovementHistory> filter(@RequestBody StockMovementHistoryFilter filterParam) {
        try {
            return service.filter(filterParam);
        } catch (Exception e) {
            return null;
        }
    }
}
