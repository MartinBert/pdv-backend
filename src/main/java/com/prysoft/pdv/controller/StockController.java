package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.Stock;
import com.prysoft.pdv.reports.StocksReport;
import com.prysoft.pdv.service.StockService;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

@RestController
@RequestMapping(value = "/{tenantid}/api/stock")
public class StockController {
    @Autowired
    private StockService service;

    @Autowired
    private StocksReport reports;


    @GetMapping
    Page<Stock> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Stock findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Stock save(@RequestBody Stock entity) {
        return service.saveOrUpdate(entity);
    }

    @PostMapping(value = "/saveAll")
    Iterable<Stock> saveAll(@RequestBody ArrayList<Stock> entities) {
        return  service.saveAll(entities);
    }

    @PutMapping
    Stock update(@RequestBody Stock entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    Page<Stock> filter(@RequestBody GenericFilter filterParam) {
        return service.filter(filterParam);
    }

    @PostMapping(value = "/filterStockForDepositId")
    Page<Stock> filterStockForDepositId(@RequestBody GenericFilter filterParam) {
        return service.filterStockForDepositId(filterParam);
    }

    @GetMapping(value = "/allStocksReport/{tenant}/{id}")
    public JasperPrint allStocksReport(@PathVariable String tenant, @PathVariable Long id, HttpServletResponse response) throws JRException, IOException, SQLException {
        return reports.allStocksReport(tenant, id, response);
    }

}