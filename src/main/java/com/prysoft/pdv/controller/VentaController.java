package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.VentaFilter;
import com.prysoft.pdv.models.ComprobanteFiscal;
import com.prysoft.pdv.reports.SalesReport;
import com.prysoft.pdv.service.VentaService;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@RestController
@RequestMapping(value = "/{tenantid}/api/ventas")
public class VentaController {
    @Autowired
    private VentaService service;

    @Autowired
    private SalesReport reports;

    @PostMapping(value = "/onCloseSaleReport/{tenant}")
    public JasperPrint onCloseSaleReport(@RequestBody ComprobanteFiscal request, @PathVariable String tenant, HttpServletResponse response) throws IOException, JRException, SQLException {
        return reports.closeSaleReport(request, tenant, response);
    }

    @GetMapping(value = "/allSalesReport/{tenant}/{id}")
    public JasperPrint allSalesReport(@PathVariable String tenant, @PathVariable Long id, HttpServletResponse response) throws JRException, IOException, SQLException {
        return reports.allSalesReport(tenant, id,response);
    }

    @GetMapping(value = "/salesForReceiptReport/{tenant}/{id}/{receipt}")
    public JasperPrint salesForReceiptReport(@PathVariable String tenant, @PathVariable Long id, @PathVariable String receipt, HttpServletResponse response) throws JRException, IOException, SQLException {
        return reports.salesForReceiptReport(tenant, id, receipt, response);
    }

    @GetMapping(value = "/salesForClientReport/{tenant}/{id}/{client}")
    public JasperPrint salesForClientReport(@PathVariable String tenant, @PathVariable Long id, @PathVariable Long client, HttpServletResponse response) throws JRException, IOException, SQLException {
        return reports.salesForClientReport(tenant, id, client, response);
    }

    @GetMapping(value = "/salesForDateReport/{tenant}/{id}/{firstDate}/{secondDate}")
    public JasperPrint salesForDateReport(@PathVariable String tenant, @PathVariable Long id, @PathVariable String firstDate, @PathVariable String secondDate, HttpServletResponse response) throws JRException, IOException, SQLException {
        return reports.salesForDateReport(tenant, id, firstDate, secondDate, response);
    }

    @GetMapping(value = "/salesForMonthReport/{tenant}/{id}/{year}/{month}")
    public JasperPrint salesForMonthReport(@PathVariable String tenant, @PathVariable Long id, @PathVariable String year, @PathVariable String month, HttpServletResponse response) throws JRException, IOException, SQLException {
        return reports.salesForMonthReport(tenant, id, year, month, response);
    }

    @GetMapping(value = "/salesForYearReport/{tenant}/{id}/{year}")
    public JasperPrint salesForYearReport(@PathVariable String tenant, @PathVariable Long id, @PathVariable String year, HttpServletResponse response) throws JRException, IOException, SQLException {
        return reports.salesForYearReport(tenant, id, year, response);
    }

    @GetMapping(value = "/allSalesGroupBy/{tenant}/{id}/{type}")
    public JasperPrint allSalesGroupBy(@PathVariable String tenant, @PathVariable Long id, @PathVariable String type, HttpServletResponse response) throws JRException, IOException, SQLException {
        return reports.allSalesGroupBy(tenant, id, type, response);
    }

    @PostMapping(value = "/filter")
    Page<ComprobanteFiscal> filter(@RequestBody VentaFilter filterParam) {
        return service.filter(filterParam);
    }
}
