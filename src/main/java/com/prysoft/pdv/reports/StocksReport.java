package com.prysoft.pdv.reports;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public interface StocksReport {
    JasperPrint allStocksReport(String tenant, Long id, HttpServletResponse response) throws SQLException, JRException, IOException;
}
