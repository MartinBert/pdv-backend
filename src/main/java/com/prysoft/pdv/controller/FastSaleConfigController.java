package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.FastSaleConfigFilter;
import com.prysoft.pdv.models.FastSaleConfig;
import com.prysoft.pdv.service.FastSaleConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping(value = "/{tenantid}/api/ventasFastConfig")
public class FastSaleConfigController {
    @Autowired
    private FastSaleConfigService service;

    @GetMapping
    Page<FastSaleConfig> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    FastSaleConfig findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    FastSaleConfig save(@RequestBody FastSaleConfig tentity) {
        return service.saveOrUpdate(tentity);
    }

    @PostMapping(value = "/saveAll")
    Iterable<FastSaleConfig> saveAll(@RequestBody ArrayList<FastSaleConfig> entities) {
        return service.saveOrUpdateAll(entities);
    }

    @PutMapping
    FastSaleConfig update(@RequestBody FastSaleConfig entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<FastSaleConfig> filter(@RequestBody FastSaleConfigFilter filterParam) {
        return service.filter(filterParam);
    }
}

