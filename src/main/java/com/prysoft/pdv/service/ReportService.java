package com.prysoft.pdv.service;

import com.prysoft.pdv.dao.ProductoDao;
import com.prysoft.pdv.models.Producto;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class ReportService {
    @Autowired
    private ProductoDao dao;

    public String exportReport(String reportFormat) throws FileNotFoundException, JRException {
        List<Producto> productos = (List<Producto>) dao.findAll();

        File file = ResourceUtils.getFile("classpath:Cherry.jrxml");
        JasperReport jasperReport= JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(productos);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Java Techie");
        JasperPrint jasperPrint= JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        if(reportFormat.equalsIgnoreCase("html")){
            JasperExportManager.exportReportToHtmlFile(jasperPrint, "C:\\Users\\Martin Bertello\\Desktop\\REPORTES\\product.html");
        }
        if(reportFormat.equalsIgnoreCase("pdf")){
            JasperExportManager.exportReportToPdfFile(jasperPrint, "C:\\Users\\Martin Bertello\\Desktop\\REPORTES\\product.pdf");
        }
        return "Report generated in C://Users";
    }
}
