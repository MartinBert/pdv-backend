package com.prysoft.pdv.reports.impl;

import com.prysoft.pdv.helpers.PrintHelper;
import com.prysoft.pdv.helpers.ZClosureHelper;
import com.prysoft.pdv.models.ZClosure;
import com.prysoft.pdv.print.PrintZCLosure;
import com.prysoft.pdv.reports.ZClosuresReport;
import com.prysoft.pdv.reports.routes.ReportsRoutes;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;

@Service
@Transactional
public class ZClosuresReportImpl implements ZClosuresReport {
    @Autowired
    private ReportsRoutes reportsRoutes;
    @Autowired
    private ZClosureHelper formatter;
    @Autowired
    private PrintHelper printHelper;

    @Override
    public JasperPrint printZClosure(ZClosure request,
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
        PrintZCLosure printZCLosure = formatter.formatObjectForPrint(request);
        ArrayList<PrintZCLosure> data = new ArrayList<>();
        data.add(printZCLosure);
        JRBeanCollectionDataSource subReportData = new JRBeanCollectionDataSource(printZCLosure.getPaymentMethodsDetail());
        HashMap<String, Object> params = new HashMap<>();
        params.put("SUBREPORT_DIR", subReportRoute);
        params.put("SUBREPORT_DATA", subReportData);
        return printHelper.printZClosure(stream, data, params, response);
    }
}
