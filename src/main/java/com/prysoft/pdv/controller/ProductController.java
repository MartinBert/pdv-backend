package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.ProductFilter;
import com.prysoft.pdv.models.Product;
import com.prysoft.pdv.print.PrintProductsLabels;
import com.prysoft.pdv.reports.ProductsReport;
import com.prysoft.pdv.service.ProductService;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLClassLoader;
import java.sql.SQLException;
import java.util.ArrayList;

@RestController
@RequestMapping(value = "/{tenantid}/api/productos")
public class ProductController {
    @Autowired
    private ProductService service;

    @Autowired
    private ProductsReport reports;

    @GetMapping
    Page<Product> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    Product findById(@PathVariable long id) {
        return service.findById(id);
    }

    @GetMapping(value = "/findByBarCode/{codigoBarra}")
    Product findByCodigoBarra(@PathVariable String codigoBarra) {
        return service.findByCodigoBarra(codigoBarra);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    Product save(@RequestBody Product entity) {
        Product obj = service.saveOrUpdate(entity);
        return obj;
    }

    @PostMapping(value = "/filter")
    public Page<Product> filter(@RequestBody ProductFilter filterParam) {
        return service.filter(filterParam);
    }

    @PostMapping(value = "/saveAll")
    Iterable<Product> saveAll(@RequestBody ArrayList<Product> entities) {
        return service.saveOrUpdateAll(entities);
    }

    @PutMapping
    Product update(@RequestBody Product entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @GetMapping(value = "/generalReport/{tenant}")
    public JasperPrint generateReport(@PathVariable String tenant, HttpServletResponse response) throws JRException, IOException, SQLException {
        return reports.generalReport(tenant, response);
    }

    @PostMapping(value = "/labels")
    public JasperPrint labels(@RequestBody ArrayList<PrintProductsLabels> productos, HttpServletResponse response) throws IOException, JRException {
        return reports.labels(productos, response);
    }
}
