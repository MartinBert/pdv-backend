package com.prysoft.pdv.reports.impl;

import com.prysoft.pdv.models.Invoice;
import com.prysoft.pdv.reports.ZClosuresReport;
import com.prysoft.pdv.reports.routes.ReportsRoutes;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

@Service
@Transactional
public class ZClosuresReportImpl implements ZClosuresReport {

    @Autowired
    private ReportsRoutes reportsRoutes;

    @Override
    public JasperPrint printZClosure(Invoice request,
                                       String specification,
                                       HttpServletResponse response)
            throws IOException, JRException, JSONException {

        String report;
        String subReport;
        if(specification.equals("A4")){
            report = "cierre_z_a4.jasper";
            subReport = "cierre_z_subreporte_a4.jasper";
        }else{
            report = "cierre_z_80mm.jasper";
            subReport = "cierre_z_subreporte_80mm.jasper";
        }
        String subReportRoute = reportsRoutes.getSubReportRoute("zClosureReports", subReport);
        InputStream stream = reportsRoutes.getStreamReportResource("zClosureReports", report);



        return null;
    }
}
