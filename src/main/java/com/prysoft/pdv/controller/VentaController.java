package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.VentaFilter;
import com.prysoft.pdv.models.ComprobanteFiscal;
import com.prysoft.pdv.service.VentaService;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.text.ParseException;

@RestController
@RequestMapping(value = "/{tenantid}/api/ventas")
public class VentaController {
    @Autowired
    private VentaService service;

    @PostMapping(value = "/onCloseSaleReport/{tenant}")
    public JasperPrint onCloseSaleReport(@RequestBody ComprobanteFiscal request, @PathVariable String tenant, HttpServletResponse response) throws IOException, JRException, SQLException, ParseException {
        JasperPrint closeSaleReport = service.closeSaleReport(request, tenant, response);
        return null;
    }

    @GetMapping(value = "/getForSucursal/{id}/{page}/{size}")
    Page<ComprobanteFiscal> getStockForSucursal(@PathVariable String id, @PathVariable int page, @PathVariable int size) {
        return service.filter(id,page,size);
    }

    @PostMapping(value = "/filter")
    Page<ComprobanteFiscal> filterVentas(@RequestBody VentaFilter request){
        return service.filterVentas(request);
    }
}
