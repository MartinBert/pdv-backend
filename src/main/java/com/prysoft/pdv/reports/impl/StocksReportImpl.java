package com.prysoft.pdv.reports.impl;

import com.prysoft.pdv.helpers.PrintHelper;
import com.prysoft.pdv.reports.StocksReport;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.HashMap;

@Service
@Transactional
public class StocksReportImpl implements StocksReport {
    @Autowired
    PrintHelper printHelper;

    @Override
    public JasperPrint allStocksReport(String tenant, Long id, HttpServletResponse response) throws SQLException, JRException, IOException {

        InputStream stream = this.getClass().getResourceAsStream("/reports/stocksReports/allStocks.jasper");
        HashMap<String, Object> params = new HashMap<>();
        params.put("SUCURSAL", id);

        return printHelper.printWithDatabaseConnection(tenant, stream, params, response);
    }
}
