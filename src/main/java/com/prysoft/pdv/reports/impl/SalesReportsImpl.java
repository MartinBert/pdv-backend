package com.prysoft.pdv.reports.impl;

import com.prysoft.pdv.dao.ComprobanteFiscalDao;
import com.prysoft.pdv.helpers.*;
import com.prysoft.pdv.models.ComprobanteFiscal;
import com.prysoft.pdv.models.PrintComprobante;
import com.prysoft.pdv.print.PrintSalesReport;
import com.prysoft.pdv.reports.SalesReport;
import com.prysoft.pdv.reports.routes.ReportsRoutes;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.apache.tomcat.util.codec.binary.Base64;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
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
    @Autowired
    private ReportsRoutes reportsRoutes;

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
    public JasperPrint closeSaleReport(ComprobanteFiscal request, String tenant, HttpServletResponse response)
            throws IOException, JRException, JSONException
    {
        if (request.getCae() != "") {
            String encodedJsonForQrCode = createEncodedJsonObject(request);
            String subReportRoute = reportsRoutes.getSubReportRoute("receiptsReports", "factura_detail.jasper");
            InputStream stream = reportsRoutes.getStreamReportResource("receiptsReports", "factura_electronica.jasper");
            PrintComprobante comprobante = printComprobanteHelper.processReceiptForPrint(request);
            List<PrintComprobante> data = new ArrayList<>(Collections.singleton(comprobante));
            JRBeanCollectionDataSource subreportDataSource = new JRBeanCollectionDataSource(comprobante.getProductos());
            HashMap<String, Object> params =
                    createHashMapForFiscalReceiptReport(subReportRoute, subreportDataSource, comprobante.getTotalVenta().toString(), encodedJsonForQrCode);
            return printHelper.printOnCloseSale(stream, data, params, response);
        } else {
            String subReportRoute = reportsRoutes.getSubReportRoute("receiptsReports", "ticket_detail.jasper");
            InputStream stream = reportsRoutes.getStreamReportResource("receiptsReports", "x_ticket.jasper");
            PrintComprobante comprobante = printComprobanteHelper.processReceiptForPrint(request);
            List<PrintComprobante> data = new ArrayList<>(Collections.singleton(comprobante));
            JRBeanCollectionDataSource subreportDataSource = new JRBeanCollectionDataSource(comprobante.getProductos());
            HashMap<String, Object> params =
                    createHashMapForNotFiscalReceiptReport(subReportRoute, subreportDataSource, comprobante.getTotalVenta().toString());
            return printHelper.printOnCloseSale(stream, data, params, response);
        }
    }

    protected String createEncodedJsonObject(ComprobanteFiscal data)
            throws JSONException
    {
        JSONObject objectForQrCode = new JSONObject();
        objectForQrCode.put("ver", 1);
        objectForQrCode.put("fecha", data.getFechaEmision());
        objectForQrCode.put("cuit", data.getSucursal().getCuit());
        objectForQrCode.put("ptoVta", data.getPuntoVenta().getIdFiscal());
        objectForQrCode.put("tipoCmp", data.getDocumentoComercial().getCodigoDocumento());
        objectForQrCode.put("nroCmp", data.getNumeroCbte());
        objectForQrCode.put("importe", data.getTotalVenta());
        objectForQrCode.put("moneda", "PES");
        objectForQrCode.put("ctz", 1);
        objectForQrCode.put("tipoDocRec", (data.getDocumentoComercial().getLetra().equals("A")) ? "80" : "96");
        objectForQrCode.put("nroDocRec", data.getCliente().getCuit());
        objectForQrCode.put("tipoCodAut", "E");
        objectForQrCode.put("codAut", data.getCae());
        byte[] econdedBase64 = Base64.encodeBase64(objectForQrCode.toString().getBytes(StandardCharsets.UTF_8));
        return new String(econdedBase64);
    }

    protected HashMap<String, Object> createHashMapForFiscalReceiptReport(String subReportDir,
                                                                          JRBeanCollectionDataSource subReportDataSource,
                                                                          String totalVenta,
                                                                          String encodedJsonForQrCode)
    {
        HashMap<String,Object> paramsForJasperReport = new HashMap<>();
        paramsForJasperReport.put("SUBREPORT_DIR", subReportDir);
        paramsForJasperReport.put("SUBREPORT_DATA", subReportDataSource);
        paramsForJasperReport.put("TOTAL_VENTA", totalVenta);
        paramsForJasperReport.put("QR_PARAM", encodedJsonForQrCode);
        return paramsForJasperReport;
    }

    protected HashMap<String, Object> createHashMapForNotFiscalReceiptReport(String subReportDir,
                                                                          JRBeanCollectionDataSource subReportDataSource,
                                                                          String totalVenta)
    {
        HashMap<String,Object> paramsForJasperReport = new HashMap<>();
        paramsForJasperReport.put("SUBREPORT_DIR", subReportDir);
        paramsForJasperReport.put("SUBREPORT_DATA", subReportDataSource);
        paramsForJasperReport.put("TOTAL_VENTA", totalVenta);
        return paramsForJasperReport;
    }

    protected JasperPrint createNotFiscalReceipt(){
        return null;
    }

    protected JasperPrint createFiscalReceipt(){
        return null;
    }
}
