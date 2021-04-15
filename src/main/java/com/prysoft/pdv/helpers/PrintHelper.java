package com.prysoft.pdv.helpers;

import com.prysoft.pdv.models.PrintComprobante;
import com.prysoft.pdv.print.PrintProductsLabels;
import com.prysoft.pdv.print.PrintSalesReport;
import com.prysoft.pdv.print.PrintWithProductDetails;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import org.springframework.stereotype.Service;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class PrintHelper implements Serializable {

    /***** SALES *****/
    public JasperPrint printWithDataSourceCollection(InputStream stream, ArrayList<PrintSalesReport> data, HashMap<String, Object> params, HttpServletResponse response) throws JRException, IOException {

        JRBeanCollectionDataSource datasource = new JRBeanCollectionDataSource(data);
        JasperReport report = (JasperReport) JRLoader.loadObject(stream);
        JasperPrint print = JasperFillManager.fillReport(report,params,datasource);
        final ServletOutputStream output = response.getOutputStream();
        JasperExportManager.exportReportToPdfStream(print, output);

        return null;
    }

    public JasperPrint printWithDataSourceCollectionAndProductDetails(InputStream stream, ArrayList<PrintWithProductDetails> data, HashMap<String, Object> params, HttpServletResponse response) throws JRException, IOException {

        JRBeanCollectionDataSource datasource = new JRBeanCollectionDataSource(data);
        JasperReport report = (JasperReport) JRLoader.loadObject(stream);
        JasperPrint print = JasperFillManager.fillReport(report,params,datasource);
        final ServletOutputStream output = response.getOutputStream();
        JasperExportManager.exportReportToPdfStream(print, output);

        return null;
    }

    public JasperPrint printOnCloseSale(InputStream stream, List<PrintComprobante> data, HashMap<String, Object> params, HttpServletResponse response) throws JRException, IOException {

        JRBeanCollectionDataSource datasource = new JRBeanCollectionDataSource(data);
        JasperReport report = (JasperReport) JRLoader.loadObject(stream);
        JasperPrint print = JasperFillManager.fillReport(report,params,datasource);
        final ServletOutputStream output = response.getOutputStream();
        JasperExportManager.exportReportToPdfStream(print, output);

        return null;
    }
    /***** SALES *****/

    /***** PRODUCTS *****/
    public JasperPrint printLabels(InputStream stream, ArrayList<PrintProductsLabels> data, HashMap<String, Object> params, HttpServletResponse response) throws JRException, IOException {

        JRBeanCollectionDataSource datasource = new JRBeanCollectionDataSource(data);
        JasperReport report = (JasperReport) JRLoader.loadObject(stream);
        JasperPrint print = JasperFillManager.fillReport(report,params,datasource);
        final ServletOutputStream output = response.getOutputStream();
        JasperExportManager.exportReportToPdfStream(print, output);

        return null;
    }
    /***** PRODUCTS *****/

    /***** GENERIC *****/
    public JasperPrint printWithDatabaseConnection(String tenant, InputStream stream, HashMap<String, Object> params, HttpServletResponse response) throws SQLException, JRException, IOException {

        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+tenant,"postgres","12345");
        JasperReport report = (JasperReport) JRLoader.loadObject(stream);
        JasperPrint print = JasperFillManager.fillReport(report,params,conn);
        final ServletOutputStream output = response.getOutputStream();
        JasperExportManager.exportReportToPdfStream(print, output);

        return null;
    }
    /***** GENERIC *****/
}
