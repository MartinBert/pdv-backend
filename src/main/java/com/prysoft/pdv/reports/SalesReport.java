package com.prysoft.pdv.reports;

import com.prysoft.pdv.models.ComprobanteFiscal;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public interface SalesReport {
    JasperPrint allSalesReport(String tenant, Long id, HttpServletResponse response) throws SQLException, JRException, IOException;
    JasperPrint closeSaleReport(ComprobanteFiscal request, String tenant, HttpServletResponse response) throws IOException, JRException, SQLException;
    JasperPrint salesForReceiptReport(String tenant, Long id, String receipt, HttpServletResponse response) throws SQLException, JRException, IOException;
    JasperPrint salesForClientReport(String tenant, Long id, Long client, HttpServletResponse response) throws SQLException, JRException, IOException;
    JasperPrint salesForDateReport(String tenant, Long id, String firstDate, String secondDate, HttpServletResponse response) throws JRException, IOException;
    JasperPrint allSalesGroupBy(String tenant, Long id, String type, HttpServletResponse response) throws JRException, IOException, SQLException;
}
