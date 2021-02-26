package com.prysoft.pdv.reports;

import com.prysoft.pdv.print.PrintProductsLabels;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public interface ProductsReport {
    JasperPrint generalReport(String tenant, HttpServletResponse response) throws JRException, IOException, SQLException;
    JasperPrint labels(ArrayList<PrintProductsLabels> productos, HttpServletResponse response) throws IOException, JRException;
}
