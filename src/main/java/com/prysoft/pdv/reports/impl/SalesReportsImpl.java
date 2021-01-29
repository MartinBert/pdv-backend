package com.prysoft.pdv.reports.impl;

import com.prysoft.pdv.dao.ComprobanteFiscalDao;
import com.prysoft.pdv.helpers.*;
import com.prysoft.pdv.models.ComprobanteFiscal;
import com.prysoft.pdv.models.PrintComprobante;
import com.prysoft.pdv.print.PrintSalesReport;
import com.prysoft.pdv.reports.SalesReport;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.sql.SQLException;
import java.util.*;

@Service
@Transactional
public class SalesReportsImpl implements SalesReport {

    @Autowired
    private ComprobanteFiscalDao dao;
    @Autowired
    private DateHelper dateHelper;
    @Autowired
    private MedioPagoHelper medioHelper;
    @Autowired
    private DocumentoComercialHelper documentoHelper;
    @Autowired
    private PrintHelper printHelper;
    @Autowired
    private PrintComprobanteHelper printComprobanteHelper;
    @Autowired
    private PrintSalesHelper printSalesHelper;

    @Override
    public JasperPrint allSalesReport(String tenant, Long id, HttpServletResponse response) throws SQLException, JRException, IOException {

        InputStream stream = this.getClass().getResourceAsStream("/reports/salesReports/allSalesForSucursal.jasper");
        HashMap<String, Object> params = new HashMap<>();
        params.put("SUCURSAL", id);

        return printHelper.printWithDatabaseConnection(tenant, stream, params, response);
    }

    @Override
    public JasperPrint salesForReceiptReport(String tenant, Long id, String receipt, HttpServletResponse response) throws SQLException, JRException, IOException {

        InputStream stream = this.getClass().getResourceAsStream("/reports/salesReports/allSalesForReceipt.jasper");
        HashMap<String, Object> params = new HashMap<>();
        params.put("SUCURSAL", id);
        params.put("CODIGO_DOCUMENTO", receipt);

        return printHelper.printWithDatabaseConnection(tenant, stream, params, response);
    }

    @Override
    public JasperPrint salesForClientReport(String tenant, Long id, Long client, HttpServletResponse response) throws SQLException, JRException, IOException {

        InputStream stream = this.getClass().getResourceAsStream("/reports/salesReports/allSalesForClient.jasper");
        HashMap<String, Object> params = new HashMap<>();
        params.put("SUCURSAL", id);
        params.put("CLIENTE_ID", client);

        return printHelper.printWithDatabaseConnection(tenant, stream, params, response);
    }

    @Override
    public JasperPrint salesForDateReport(String tenant, Long id, String firstDate, String secondDate, HttpServletResponse response) throws JRException, IOException {

        Iterable<ComprobanteFiscal> receipts = dao.findAll();
        ArrayList<PrintSalesReport> data = new ArrayList<>();
        for (ComprobanteFiscal c : receipts) {
            Double date = dateHelper.stringDateToDoubleConvertion(c.getFechaEmision());
            if (date >= Double.parseDouble(firstDate) && date <= Double.parseDouble(secondDate)) {
                if (c.getSucursal().getId() == id && documentoHelper.checkReceiptIsInvoice(c.getDocumentoComercial())) {
                    PrintSalesReport detail = printSalesHelper.processReceiptForPrint(c);
                    data.add(detail);
                }
            }
        }
        InputStream stream = this.getClass().getResourceAsStream("/reports/salesReports/salesForDate.jasper");
        HashMap<String, Object> params = new HashMap<>();

        return printHelper.printWithDataSourceCollection(stream, data, params, response);
    }

    @Override
    public JasperPrint salesForMonthReport(String tenant, Long id, String year, String month, HttpServletResponse response) throws JRException, IOException {

        Iterable<ComprobanteFiscal> receipts = dao.findAll();
        ArrayList<PrintSalesReport> data = new ArrayList<>();
        for (ComprobanteFiscal c : receipts) {
            if (c.getFechaEmision().substring(3).equals(month.concat("/") + year)) {
                if (c.getSucursal().getId() == id && documentoHelper.checkReceiptIsInvoice(c.getDocumentoComercial())) {
                    PrintSalesReport detail = printSalesHelper.processReceiptForPrint(c);
                    data.add(detail);
                }
            }
        }

        InputStream stream = this.getClass().getResourceAsStream("/reports/salesReports/salesForMonth.jasper");
        HashMap<String, Object> params = new HashMap<>();
        params.put("YEAR", year);
        params.put("MONTH", dateHelper.getMonthName(month).toUpperCase());

        return printHelper.printWithDataSourceCollection(stream, data, params, response);
    }

    @Override
    public JasperPrint salesForYearReport(String tenant, Long id, String year, HttpServletResponse response) throws JRException, IOException {

        Iterable<ComprobanteFiscal> receipts = dao.findAll();
        ArrayList<PrintSalesReport> data = new ArrayList<>();
        for (ComprobanteFiscal c : receipts) {
            if (c.getFechaEmision().substring(6).equals(year)) {
                if (c.getSucursal().getId() == id && documentoHelper.checkReceiptIsInvoice(c.getDocumentoComercial())) {
                    PrintSalesReport detail = printSalesHelper.processReceiptForPrint(c);
                    data.add(detail);
                }
            }
        }

        InputStream stream = this.getClass().getResourceAsStream("/reports/salesReports/salesForYear.jasper");
        HashMap<String, Object> params = new HashMap<>();
        params.put("YEAR", year);

        return printHelper.printWithDataSourceCollection(stream, data, params, response);
    }

    @Override
    public JasperPrint allSalesGroupBy(String tenant, Long id, String type, HttpServletResponse response) throws JRException, IOException, SQLException {

        InputStream stream = this.getClass().getResourceAsStream("/reports/salesReports/allSalesGroupBy" + type + ".jasper");
        HashMap<String, Object> params = new HashMap<>();
        params.put("SUCURSAL", id);

        return printHelper.printWithDatabaseConnection(tenant, stream, params, response);
    }

    @Override
    public JasperPrint closeSaleReport(ComprobanteFiscal request, String tenant, HttpServletResponse response) throws IOException, JRException {

        if (request.getCae() != "") {
            List<PrintComprobante> data = new ArrayList<>();
            String detailRoute = Paths.get("", "src", "main", "resources", "reports/receiptsReports/factura_detail.jasper").toString();
            InputStream stream = this.getClass().getResourceAsStream("/reports/receiptsReports/factura_electronica.jasper");
            PrintComprobante comprobante = printComprobanteHelper.processReceiptForPrint(request);
            data.add(comprobante);
            JRBeanCollectionDataSource subreportDataSource = new JRBeanCollectionDataSource(comprobante.getProductos());
            HashMap<String, Object> params = new HashMap<>();
            params.put("SUBREPORT_DIR", detailRoute);
            params.put("SUBREPORT_DATA", subreportDataSource);
            params.put("TOTAL_VENTA", comprobante.getTotalVenta().toString());

            return printHelper.printOnCloseSale(stream, data, params, response);
        } else {
            List<PrintComprobante> data = new ArrayList<>();
            String detailRoute = Paths.get("", "src", "main", "resources", "reports/receiptsReports/ticket_detail.jasper").toString();
            InputStream stream = this.getClass().getResourceAsStream("/reports/receiptsReports/x_ticket.jasper");
            PrintComprobante comprobante = printComprobanteHelper.processReceiptForPrint(request);
            data.add(comprobante);
            JRBeanCollectionDataSource subreportDataSource = new JRBeanCollectionDataSource(comprobante.getProductos());
            HashMap<String, Object> params = new HashMap<>();
            params.put("SUBREPORT_DIR", detailRoute);
            params.put("SUBREPORT_DATA", subreportDataSource);
            params.put("TOTAL_VENTA", comprobante.getTotalVenta().toString());

            return printHelper.printOnCloseSale(stream, data, params, response);
        }
    }
}
