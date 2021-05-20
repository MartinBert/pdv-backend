package com.prysoft.pdv.reports.impl;

import com.prysoft.pdv.helpers.PrintHelper;
import com.prysoft.pdv.print.PrintProductsLabels;
import com.prysoft.pdv.reports.ProductsReport;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

@Service
@Transactional
public class ProductsReportImpl implements ProductsReport {

    @Autowired
    private PrintHelper printHelper;

    @Override
    public JasperPrint generalReport(String tenant, HttpServletResponse response) throws JRException, IOException, SQLException {
        InputStream stream = this.getClass().getResourceAsStream("/reports/productsReports/AllProducts.jasper");
        HashMap<String, Object> params = new HashMap<>();

        return printHelper.printWithDatabaseConnection(tenant, stream, params, response);
    }

    @Override
    public JasperPrint labels(ArrayList<PrintProductsLabels> productos, HttpServletResponse response) throws IOException, JRException {
        InputStream stream = this.getClass().getResourceAsStream("/reports/productsReports/labelWithoutPrice.jasper");
        HashMap<String, Object> params = new HashMap<>();
        return printHelper.printLabels(stream, productos, params, response);
    }
}
