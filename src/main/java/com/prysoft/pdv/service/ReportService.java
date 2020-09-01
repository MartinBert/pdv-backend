package com.prysoft.pdv.service;

import com.prysoft.pdv.dao.ComprobanteFiscalDao;
import com.prysoft.pdv.dao.ProductoDao;
import com.prysoft.pdv.models.ComprobanteFiscal;
import com.prysoft.pdv.models.Producto;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.ResourceUtils;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class ReportService {
    @Autowired
    private ProductoDao daoP;
    private ComprobanteFiscalDao daoCF;

    private String path = "C:\\Users\\Martin Bertello\\Desktop\\REPORTES\\";

    public String exportReport(String reportFormat, String type,String tenant) throws IOException, JRException {
        List<Producto> productos = (List<Producto>) daoP.findAll();

        File file = ResourceUtils.getFile("classpath:"+type);
        JasperReport jasperReport= JasperCompileManager.compileReport(file.getAbsolutePath());
        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(productos);
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("createdBy", "Martin Bertello");
        JasperPrint jasperPrint= JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        if(reportFormat.equalsIgnoreCase("html")){
            JasperExportManager.exportReportToHtmlFile(jasperPrint, path+"product.html");
        }
        if(reportFormat.equalsIgnoreCase("pdf")){
            File carpeta = new File(path);
            File[] list = carpeta.listFiles();
            if(list.length == 0){
                JasperExportManager.exportReportToPdfFile(jasperPrint, path+"ListaProductos.pdf");
            }else{
                JasperExportManager.exportReportToPdfFile(jasperPrint, path+"ListaProductos"+list.length+".pdf");
            }
        }
        return "Report generated in C:/Users/Martin Bertello/Desktop/REPORTES";
    }

    public ComprobanteFiscal exportRecipes(Long id){

        Optional<ComprobanteFiscal> comprobante = daoCF.findById(id);
        if(comprobante.isPresent()){
            System.out.println(comprobante);
        }else{
            System.out.println("No se encontró comprobante");
        }
        return null;
    }
}
