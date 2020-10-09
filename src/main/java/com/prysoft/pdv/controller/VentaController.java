package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.VentaFilter;
import com.prysoft.pdv.models.ComprobanteFiscal;
import com.prysoft.pdv.models.Venta;
import com.prysoft.pdv.service.VentaService;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping(value = "/{tenantid}/api/ventas")
public class VentaController {
    @Autowired
    private VentaService service;

    @GetMapping
    Page<Venta> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Venta findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Venta save(@RequestBody Venta entity) {
        return service.saveOrUpdate(entity);
    }

    @PutMapping
    Venta update(@RequestBody Venta entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<Venta> filter(@RequestBody VentaFilter filter) {
        return service.filter(filter);
    }

    @PostMapping(value = "/onCloseSaleReport")
    public JasperPrint onCloseSaleReport(@RequestBody ComprobanteFiscal request) throws IOException, JRException {
        JasperPrint closeSaleReport = service.closeSaleReport(request);
        return null;
    }
}
