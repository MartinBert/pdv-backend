package com.prysoft.pdv.reports.routes;

import org.springframework.stereotype.Service;

import java.io.InputStream;
import java.nio.file.Paths;

@Service
public class ReportsRoutes {
    public String getSubReportRoute(String subReportDirectory, String subreportName) {
        return Paths.get("", "src", "main", "resources", "reports", subReportDirectory, subreportName).toString();
    }

    public InputStream getStreamReportResource(String reportDirectory, String reportName) {
        return this.getClass().getClassLoader().getResourceAsStream("reports/" + reportDirectory + "/" + reportName);
    }
}
