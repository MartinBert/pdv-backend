package com.prysoft.pdv.reports;

import com.prysoft.pdv.models.Invoice;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import org.json.JSONException;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public interface ZClosuresReport {
    JasperPrint printZClosure(Invoice request,
                                String specification,
                                HttpServletResponse response)
            throws IOException, JRException, SQLException, JSONException;
}
