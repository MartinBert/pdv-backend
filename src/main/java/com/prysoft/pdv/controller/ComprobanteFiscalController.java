package com.prysoft.pdv.controller;

import com.prysoft.pdv.dto.ComprobanteFiscalFilter;
import com.prysoft.pdv.models.ComprobanteFiscal;
import com.prysoft.pdv.service.ComprobanteFiscalService;
import com.prysoft.pdv.service.ReportService;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.io.FileNotFoundException;

@RestController
@RequestMapping(value = "/{tenantid}/api/comprobantesFiscales")
public class ComprobanteFiscalController {
    @Autowired
    private ComprobanteFiscalService service;

    @Autowired
    private ReportService reportService;

    private ComprobanteFiscal returnComproabantes(ComprobanteFiscal comprobante) throws FileNotFoundException, JRException, JSONException {
        JasperPrint reportaso = reportService.generarReporteProductos();
        JasperViewer viewer = new JasperViewer(reportaso);
        viewer.setVisible(true);
        return reportService.exportRecipes(comprobante.getId());
    }

    @GetMapping
    Page<ComprobanteFiscal> findAll(Pageable page) {
        return service.findAll(page);
    }

    @GetMapping(value = "/{id}")
    ComprobanteFiscal findById(@PathVariable long id) {
        return service.findById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    ComprobanteFiscal save(@RequestBody ComprobanteFiscal entity) throws FileNotFoundException, JRException, JSONException {
        ComprobanteFiscal comprobante = service.saveOrUpdate(entity);
        return returnComproabantes(comprobante);
    }

    @PutMapping
    ComprobanteFiscal update(@RequestBody ComprobanteFiscal entity) {
        return service.saveOrUpdate(entity);
    }

    @DeleteMapping(value = "/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "/filter")
    public Page<ComprobanteFiscal> filter(@RequestBody ComprobanteFiscalFilter filter) {
        return service.filter(filter);
    }
}
