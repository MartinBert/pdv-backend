package com.prysoft.pdv.service;

import com.prysoft.pdv.dao.ClienteDao;
import com.prysoft.pdv.dao.ComprobanteFiscalDao;
import com.prysoft.pdv.dao.ProductoDao;
import com.prysoft.pdv.models.ComprobanteFiscal;
import com.prysoft.pdv.models.Producto;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.RestController;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.*;

@RestController
public class ReportService {
    @Autowired
    private ProductoDao daoProducto;

    @Autowired
    private ComprobanteFiscalDao daoComprobanteFiscal;

    @Autowired
    private ClienteDao daoCliente;

    private String path = "C:\\Users\\Martin Bertello\\Desktop\\REPORTES\\";

    public String exportReport(String reportFormat, String type,String tenant) throws IOException, JRException {
        List<Producto> productos = (List<Producto>) daoProducto.findAll();

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

    public ComprobanteFiscal exportRecipes(Long id) throws FileNotFoundException, JRException {
        System.out.println(id);
        Optional<ComprobanteFiscal> comprobante = daoComprobanteFiscal.findById(id);

        ComprobanteFiscal comp = comprobante.get();

        ArrayList<Producto> productos = comp.getProductos();

        File file = ResourceUtils.getFile("classpath:FacturaElectronica.jrxml");
        File detail = ResourceUtils.getFile("classpath:FacturaElectronicaDetalle.jrxml");
        JasperReport jasperReport= JasperCompileManager.compileReport(file.getAbsolutePath());
        JasperReport recipeDetail= JasperCompileManager.compileReport(detail.getAbsolutePath());

        JRBeanCollectionDataSource dataSource = new JRBeanCollectionDataSource(Collections.singleton(comp));
        Map<String, Object> parameters = new HashMap<>();
        parameters.put("productos", productos);
        JasperPrint jasperPrint= JasperFillManager.fillReport(jasperReport, parameters, dataSource);
        File carpeta = new File(path);
        File[] list = carpeta.listFiles();
        if(list.length == 0){
            JasperExportManager.exportReportToPdfFile(jasperPrint, path+"Documento.pdf");
        }else{
            JasperExportManager.exportReportToPdfFile(jasperPrint, path+"Documento"+list.length+".pdf");
        }

        return null;
    }
}

