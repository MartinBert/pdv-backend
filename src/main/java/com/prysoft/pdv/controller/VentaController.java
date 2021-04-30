package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.SaleFilter;
import com.prysoft.pdv.models.Invoice;
import com.prysoft.pdv.print.PrintSaleForSelectedProductAndDate;
import com.prysoft.pdv.print.SearchFilterInProductsSold;
import com.prysoft.pdv.reports.SalesReport;
import com.prysoft.pdv.service.SaleService;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import org.json.JSONException;
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
    private SaleService service;

    @Autowired
    private SalesReport reports;

    @PostMapping(value = "/onCloseSaleReport/{tenant}")
    public JasperPrint onCloseSaleReport(@RequestBody Invoice request,
                                         @PathVariable String tenant,
                                         HttpServletResponse response)
            throws IOException, JRException, SQLException, JSONException {
        return reports.closeSaleReport(request, tenant, response);
    }

    @GetMapping(value = "/allSalesReport/{tenant}/{id}")
    public JasperPrint allSalesReport(@PathVariable String tenant,
                                      @PathVariable Long id,
                                      HttpServletResponse response)
            throws JRException, IOException, SQLException {
        return reports.allSalesReport(tenant, id, response);
    }

    @GetMapping(value = "/salesForReceiptReport/{tenant}/{id}/{receipt}")
    public JasperPrint salesForReceiptReport(@PathVariable String tenant,
                                             @PathVariable Long id,
                                             @PathVariable String receipt,
                                             HttpServletResponse response)
            throws JRException, IOException, SQLException {
        return reports.salesForReceiptReport(tenant, id, receipt, response);
    }

    @GetMapping(value = "/salesForClientReport/{tenant}/{id}/{client}")
    public JasperPrint salesForClientReport(@PathVariable String tenant,
                                            @PathVariable Long id,
                                            @PathVariable Long client,
                                            HttpServletResponse response)
            throws JRException, IOException, SQLException {
        return reports.salesForClientReport(tenant, id, client, response);
    }

    @GetMapping(value = "/salesForDateReport/{tenant}/{id}/{firstDate}/{secondDate}")
    public JasperPrint salesForDateReport(@PathVariable String tenant,
                                          @PathVariable Long id,
                                          @PathVariable String firstDate,
                                          @PathVariable String secondDate,
                                          HttpServletResponse response)
            throws JRException, IOException {
        return reports.salesForDateReport(tenant, id, firstDate, secondDate, response);
    }

    @GetMapping(value = "/salesForMonthReport/{tenant}/{id}/{year}/{month}")
    public JasperPrint salesForMonthReport(@PathVariable String tenant,
                                           @PathVariable Long id,
                                           @PathVariable String year,
                                           @PathVariable String month,
                                           HttpServletResponse response) throws JRException, IOException {
        return reports.salesForMonthReport(tenant, id, year, month, response);
    }

    @GetMapping(value = "/salesForYearReport/{tenant}/{id}/{year}")
    public JasperPrint salesForYearReport(@PathVariable String tenant,
                                          @PathVariable Long id,
                                          @PathVariable String year,
                                          HttpServletResponse response)
            throws JRException, IOException {
        return reports.salesForYearReport(tenant, id, year, response);
    }

    @GetMapping(value = "/allSalesGroupBy/{tenant}/{id}/{type}")
    public JasperPrint allSalesGroupBy(@PathVariable String tenant,
                                       @PathVariable Long id,
                                       @PathVariable String type,
                                       HttpServletResponse response)
            throws JRException, IOException, SQLException {
        return reports.allSalesGroupBy(tenant, id, type, response);
    }

    @PostMapping(value = "/salesForSelectedProductsAndDateRange/{id}")
    public JasperPrint salesForSelectedProductsAndDateRangeReport(@RequestBody PrintSaleForSelectedProductAndDate request,
                                                                  @PathVariable Long id,
                                                                  HttpServletResponse response)
            throws IOException, JRException, SQLException, JSONException {
        return reports.salesForSelectedProductsAndDateRangeReport(request, id, response);
    }

    @PostMapping(value = "/findQuantityOfProductsSold/{id}")
    public JasperPrint findQuantityOfProductsSold(@PathVariable Long id,
                                                  @RequestBody SearchFilterInProductsSold search,
                                                  HttpServletResponse response)
            throws JRException, IOException, SQLException {
        return reports.findQuantityOfProductsSold(id, search, response);
    }

    @PostMapping(value = "/filter")
    Page<Invoice> filter(@RequestBody SaleFilter filterParam) {
        return service.filter(filterParam);
    }
}
