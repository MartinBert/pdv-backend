package com.prysoft.pdv.reports.impl;

import com.prysoft.pdv.dao.InvoiceDao;
import com.prysoft.pdv.helpers.*;
import com.prysoft.pdv.models.*;
import com.prysoft.pdv.print.*;
import com.prysoft.pdv.reports.SalesReport;
import com.prysoft.pdv.reports.routes.ReportsRoutes;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
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
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class SalesReportsImpl implements SalesReport {
    @Autowired
    private InvoiceDao dao;
    @Autowired
    private DateHelper dateHelper;
    @Autowired
    private PaymentMethodHelper medioHelper;
    @Autowired
    private CommercialDocumentHelper documentoHelper;
    @Autowired
    private PrintHelper printHelper;
    @Autowired
    private InvoicePrintHelper invoicePrintHelper;
    @Autowired
    private PrintSalesHelper printSalesHelper;
    @Autowired
    private ReportsRoutes reportsRoutes;

    @Override
    public JasperPrint allSalesReport(String tenant,
                                      Long id,
                                      HttpServletResponse response)
            throws SQLException, JRException, IOException {
        InputStream stream = reportsRoutes.getStreamReportResource("salesReports", "allSalesForSucursal.jasper");
        HashMap<String, Object> params = new HashMap<>();
        params.put("SUCURSAL", id);
        return printHelper.printWithDatabaseConnection(tenant, stream, params, response);
    }

    @Override
    public JasperPrint salesForReceiptReport(String tenant,
                                             Long id,
                                             String receipt,
                                             HttpServletResponse response)
            throws SQLException, JRException, IOException {
        InputStream stream = reportsRoutes.getStreamReportResource("salesReports", "allSalesForReceipt.jasper");
        HashMap<String, Object> params = new HashMap<>();
        params.put("SUCURSAL", id);
        params.put("CODIGO_DOCUMENTO", receipt);
        return printHelper.printWithDatabaseConnection(tenant, stream, params, response);
    }

    @Override
    public JasperPrint salesForClientReport(String tenant,
                                            Long id,
                                            Long client,
                                            HttpServletResponse response)
            throws SQLException, JRException, IOException {
        InputStream stream = reportsRoutes.getStreamReportResource("salesReports", "allSalesForClient.jasper");
        HashMap<String, Object> params = new HashMap<>();
        params.put("SUCURSAL", id);
        params.put("CLIENTE_ID", client);
        return printHelper.printWithDatabaseConnection(tenant, stream, params, response);
    }

    @Override
    public JasperPrint salesForDateReport(String tenant,
                                          Long id,
                                          String firstDate,
                                          String secondDate,
                                          HttpServletResponse response)
            throws JRException, IOException {
        Iterable<Invoice> receipts = dao.findAll();
        ArrayList<PrintSalesReport> data = new ArrayList<>();
        for (Invoice c : receipts) {
            Double date = dateHelper.stringDateToDoubleConvertion(c.getFechaEmision());
            if (date >= Double.parseDouble(firstDate) && date <= Double.parseDouble(secondDate)) {
                if (c.getSucursal().getId() == id && documentoHelper.checkReceiptIsInvoice(c.getDocumentoComercial())) {
                    PrintSalesReport detail = printSalesHelper.processReceiptForPrint(c);
                    data.add(detail);
                }
            }
        }
        InputStream stream = reportsRoutes.getStreamReportResource("salesReports", "salesForDate.jasper");
        HashMap<String, Object> params = new HashMap<>();
        return printHelper.printWithDataSourceCollection(stream, data, params, response);
    }

    @Override
    public JasperPrint salesForMonthReport(String tenant,
                                           Long id,
                                           String year,
                                           String month,
                                           HttpServletResponse response)
            throws JRException, IOException {
        Iterable<Invoice> receipts = dao.findAll();
        ArrayList<PrintSalesReport> data = new ArrayList<>();
        for (Invoice c : receipts) {
            if (c.getFechaEmision().substring(3).equals(month.concat("/") + year)) {
                if (c.getSucursal().getId() == id && documentoHelper.checkReceiptIsInvoice(c.getDocumentoComercial())) {
                    PrintSalesReport detail = printSalesHelper.processReceiptForPrint(c);
                    data.add(detail);
                }
            }
        }
        InputStream stream = reportsRoutes.getStreamReportResource("salesReports", "salesForMonth.jasper");
        HashMap<String, Object> params = new HashMap<>();
        params.put("YEAR", year);
        params.put("MONTH", dateHelper.getMonthName(month).toUpperCase());
        return printHelper.printWithDataSourceCollection(stream, data, params, response);
    }

    @Override
    public JasperPrint salesForYearReport(String tenant,
                                          Long id,
                                          String year,
                                          HttpServletResponse response)
            throws JRException, IOException {
        Iterable<Invoice> receipts = dao.findAll();
        ArrayList<PrintSalesReport> data = new ArrayList<>();
        for (Invoice c : receipts) {
            if (c.getFechaEmision().substring(6).equals(year)) {
                if (c.getSucursal().getId() == id && isInvoice(c)) {
                    PrintSalesReport detail = printSalesHelper.processReceiptForPrint(c);
                    data.add(detail);
                }
            }
        }
        InputStream stream = reportsRoutes.getStreamReportResource("salesReports", "salesForYear.jasper");
        HashMap<String, Object> params = new HashMap<>();
        params.put("YEAR", year);
        return printHelper.printWithDataSourceCollection(stream, data, params, response);
    }

    @Override
    public JasperPrint allSalesGroupBy(String tenant,
                                       Long id,
                                       String type,
                                       HttpServletResponse response)
            throws JRException, IOException, SQLException {
        InputStream stream = reportsRoutes.getStreamReportResource("salesReports", "allSalesGroupBy" + type + ".jasper");
        HashMap<String, Object> params = new HashMap<>();
        params.put("SUCURSAL", id);
        return printHelper.printWithDatabaseConnection(tenant, stream, params, response);
    }

    @Override
    public JasperPrint findQuantityOfProductsSold(Long id,
                                                  SearchFilterInProductsSold search,
                                                  HttpServletResponse response)
            throws JRException, IOException, SQLException {
        InputStream stream = reportsRoutes.getStreamReportResource("salesReports", "quantityProductsSoldReport.jasper");
        ArrayList<QuantityProductsSold> data = new ArrayList<>();
        Iterable<Invoice> vouchers = dao.findAll();
        for (Invoice voucher : vouchers) {
            if (invoiceBelongsToBranch(id, voucher)) {
                if (voucherIsInDateRange(voucher, search)) {
                    for (PrintComprobanteDetail detailInVoucher : voucher.getProductos()) {
                        QuantityProductsSold detail = new QuantityProductsSold();
                        if (detailInVoucher.getNombre().toLowerCase().trim().equals(search.getSearch().toLowerCase().trim())) {
                            if (data.isEmpty()) {
                                detail.setNameOfProduct(detailInVoucher.getNombre());
                                detail.setQuantity(Double.parseDouble(detailInVoucher.getCantUnidades()));
                                detail.setTotal(detailInVoucher.getPrecioTotal());
                                data.add(detail);
                            } else {
                                data.get(0).setQuantity(data.get(0).getQuantity() + Double.parseDouble(detailInVoucher.getCantUnidades()));
                                data.get(0).setTotal(data.get(0).getTotal() + detailInVoucher.getPrecioTotal());
                            }
                        }
                    }
                }
            }
        }
        HashMap<String, Object> params = new HashMap<>();
        params.put("INIT_DATE", search.getInitDate());
        params.put("FINISH_DATE", search.getFinishDate());
        return printHelper.printWithDataSourceCollectionQuantityProductsSold(stream, data, params, response);
    }

    protected boolean voucherIsInDateRange(Invoice voucher, SearchFilterInProductsSold search) {
        return date(voucher.getFechaEmision()) >= date(search.getInitDate()) && date(voucher.getFechaEmision()) <= date(search.getFinishDate());
    }

    @Override
    public JasperPrint closeSaleReport(Invoice request,
                                       String tenant,
                                       HttpServletResponse response)
            throws IOException, JRException, JSONException {
        if (request.getCae() != "") {
            String encodedJsonForQrCode = createEncodedJsonObject(request);
            String subReportRoute = reportsRoutes.getSubReportRoute("receiptsReports", "factura_detail.jasper");
            InputStream stream = reportsRoutes.getStreamReportResource("receiptsReports", "factura_electronica.jasper");
            PrintComprobante comprobante = invoicePrintHelper.processReceiptForPrint(request);
            List<PrintComprobante> data = new ArrayList<>(Collections.singleton(comprobante));
            System.out.println(comprobante.getProductos());
            JRBeanCollectionDataSource subreportDataSource = new JRBeanCollectionDataSource(comprobante.getProductos());
            HashMap<String, Object> params =
                    createHashMapForFiscalReceiptReport(subReportRoute, subreportDataSource, comprobante.getTotalVenta().toString(), encodedJsonForQrCode);
            return printHelper.printOnCloseSale(stream, data, params, response);
        } else {
            String subReportRoute = reportsRoutes.getSubReportRoute("receiptsReports", "ticket_detail.jasper");
            InputStream stream = reportsRoutes.getStreamReportResource("receiptsReports", "x_ticket.jasper");
            PrintComprobante comprobante = invoicePrintHelper.processReceiptForPrint(request);
            List<PrintComprobante> data = new ArrayList<>(Collections.singleton(comprobante));
            JRBeanCollectionDataSource subreportDataSource = new JRBeanCollectionDataSource(comprobante.getProductos());
            HashMap<String, Object> params =
                    createHashMapForNotFiscalReceiptReport(subReportRoute, subreportDataSource, comprobante.getTotalVenta().toString());
            return printHelper.printOnCloseSale(stream, data, params, response);
        }
    }

    protected String createEncodedJsonObject(Invoice data)
            throws JSONException {
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
                                                                          String encodedJsonForQrCode) {
        HashMap<String, Object> paramsForJasperReport = new HashMap<>();
        paramsForJasperReport.put("SUBREPORT_DIR", subReportDir);
        paramsForJasperReport.put("SUBREPORT_DATA", subReportDataSource);
        paramsForJasperReport.put("TOTAL_VENTA", totalVenta);
        paramsForJasperReport.put("QR_PARAM", encodedJsonForQrCode);
        return paramsForJasperReport;
    }

    protected HashMap<String, Object> createHashMapForNotFiscalReceiptReport(String subReportDir,
                                                                             JRBeanCollectionDataSource subReportDataSource,
                                                                             String totalVenta) {
        HashMap<String, Object> paramsForJasperReport = new HashMap<>();
        paramsForJasperReport.put("SUBREPORT_DIR", subReportDir);
        paramsForJasperReport.put("SUBREPORT_DATA", subReportDataSource);
        paramsForJasperReport.put("TOTAL_VENTA", totalVenta);
        return paramsForJasperReport;
    }

    @Override
    public JasperPrint salesForSelectedProductsAndDateRangeReport(PrintSaleForSelectedProductAndDate request,
                                                                  Long id,
                                                                  HttpServletResponse response)
            throws JRException, IOException {
        InputStream stream = reportsRoutes.getStreamReportResource("salesReports", "salesForProductAndDates.jasper");
        String subReportRoute = reportsRoutes.getSubReportRoute("salesReports", "salesForProductAndDatesSubReport.jasper");
        String subReportProductsDetailRoute = reportsRoutes.getSubReportRoute("salesReports", "productAndDateDetailsSubReport.jasper");
        ArrayList<PrintWithProductDetails> data = new ArrayList<>();
        ArrayList<PrintSaleProductQuantityDetail> subReportProductsDetail = new ArrayList<>();
        Iterable<Invoice> vouchers = dao.findAll();
        for (Invoice voucher : vouchers) {
            if (isInvoice(voucher)) {
                if (invoiceIsInTheDateRange(voucher, request)) {
                    if (invoiceContainProducts(voucher, request.getProducts())) {
                        if (invoiceBelongsToBranch(id, voucher)) {
                            PrintWithProductDetails detail = printSalesHelper.processReceiptForPrintWithProductDetails(voucher);
                            for (ProductoDescription productoDescriptionInVoucher : voucher.getProductoDescription()) {
                                if (subReportProductsDetail.isEmpty()) {
                                    PrintSaleProductQuantityDetail printSaleProductQuantityDetail = printSalesHelper.processPrintSaleProductQuantityDetail(productoDescriptionInVoucher, request);
                                    if (printSaleProductQuantityDetail != null) {
                                        subReportProductsDetail.add(printSaleProductQuantityDetail);
                                    }
                                } else {
                                    ArrayList<PrintSaleProductQuantityDetail> check = new ArrayList<>();
                                    PrintSaleProductQuantityDetail printSaleProductQuantityDetail = printSalesHelper.processPrintSaleProductQuantityDetail(productoDescriptionInVoucher, request);
                                    for (PrintSaleProductQuantityDetail printSaleProductQuantityDetailInSubReportArray : subReportProductsDetail) {
                                        if (printSaleProductQuantityDetail != null && printSaleProductQuantityDetailInSubReportArray != null) {
                                            if (printSaleProductQuantityDetailInSubReportArray.getProduct().equals(printSaleProductQuantityDetail.getProduct())) {
                                                check.add(printSaleProductQuantityDetail);
                                            }
                                        }
                                    }
                                    if (check.isEmpty()) {
                                        if (printSaleProductQuantityDetail != null) {
                                            subReportProductsDetail.add(printSaleProductQuantityDetail);
                                        }
                                    } else {
                                        for (PrintSaleProductQuantityDetail printSaleProductQuantityDetailInSubReportArray : subReportProductsDetail) {
                                            if (printSaleProductQuantityDetail != null && printSaleProductQuantityDetailInSubReportArray != null) {
                                                if (printSaleProductQuantityDetailInSubReportArray.getProduct().equals(printSaleProductQuantityDetail.getProduct())) {
                                                    printSaleProductQuantityDetailInSubReportArray.setQuantity(printSaleProductQuantityDetailInSubReportArray.getQuantity() + printSaleProductQuantityDetail.getQuantity());
                                                    printSaleProductQuantityDetailInSubReportArray.setAmount(printSaleProductQuantityDetailInSubReportArray.getAmount() + printSaleProductQuantityDetail.getAmount());
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                            data.add(detail);
                        }
                    }
                }
            }
        }
        JRBeanCollectionDataSource subReportProductsDetailDataSource = new JRBeanCollectionDataSource(subReportProductsDetail);
        HashMap<String, Object> params = new HashMap<>();
        params.put("SUBREPORT_DIR", subReportRoute);
        params.put("SUBREPORT_PRODUCTS_DIR", subReportProductsDetailRoute);
        params.put("SUBREPORT_PRODUCTS_DATA", subReportProductsDetailDataSource);
        return printHelper.printWithDataSourceCollectionAndProductDetails(stream, data, params, response);
    }

    protected boolean isInvoice(Invoice receipt) {
        return documentoHelper.checkReceiptIsInvoice(receipt.getDocumentoComercial());
    }

    protected boolean invoiceIsInTheDateRange(Invoice receipt,
                                              PrintSaleForSelectedProductAndDate request) {
        return date(receipt.getFechaEmision()) >= date(request.getFechaDesde()) && date(receipt.getFechaEmision()) <= date(request.getFechaHasta());
    }

    protected boolean invoiceContainProducts(Invoice receipt,
                                             ArrayList<Product> requestProducts) {
        boolean status = false;
        if (receipt.getProductoDescription() != null) {
            for (ProductoDescription productOfReceipt : receipt.getProductoDescription()) {
                for (Product product : requestProducts) {
                    if (productOfReceipt.getBarCode().equals(product.getCodigoBarra())) {
                        status = true;
                    }
                }
            }
        } else {
            status = false;
        }
        return status;
    }

    protected boolean invoiceBelongsToBranch(Long id,
                                             Invoice receipt) {
        return receipt.getSucursal().getId() == id;
    }

    protected double date(String date) {
        return dateHelper.stringDateToDoubleConvertion(date);
    }
}
