package com.prysoft.pdv.reports;

import com.prysoft.pdv.dao.ComprobanteFiscalDao;
import com.prysoft.pdv.models.ComprobanteFiscal;
import com.prysoft.pdv.models.PrintComprobante;
import com.prysoft.pdv.print.PrintSalesReport;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

@Service
@Transactional
public class SalesReportsImpl implements SalesReport{

    @Autowired
    private ComprobanteFiscalDao dao;

    @Override
    public JasperPrint allSalesReport(String tenant, Long id, HttpServletResponse response) throws SQLException, JRException, IOException {

        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+tenant,"postgres","12345");
        InputStream stream = this.getClass().getResourceAsStream("/reports/salesReports/allSalesForSucursal.jasper");
        HashMap<String, Object> params = new HashMap<>();
        params.put("SUCURSAL", id);
        JasperReport report = (JasperReport) JRLoader.loadObject(stream);
        JasperPrint print = JasperFillManager.fillReport(report,params,conn);
        final ServletOutputStream output = response.getOutputStream();
        JasperExportManager.exportReportToPdfStream(print, output);

        return null;
    }

    @Override
    public JasperPrint salesForReceiptReport(String tenant, Long id, String receipt, HttpServletResponse response) throws SQLException, JRException, IOException {

        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+tenant,"postgres","12345");
        InputStream stream = this.getClass().getResourceAsStream("/reports/salesReports/allSalesForReceipt.jasper");
        HashMap<String, Object> params = new HashMap<>();
        params.put("SUCURSAL", id);
        params.put("CODIGO_DOCUMENTO", receipt);
        JasperReport report = (JasperReport) JRLoader.loadObject(stream);
        JasperPrint print = JasperFillManager.fillReport(report,params,conn);
        final ServletOutputStream output = response.getOutputStream();
        JasperExportManager.exportReportToPdfStream(print, output);

        return null;
    }

    @Override
    public JasperPrint salesForClientReport(String tenant, Long id, Long client, HttpServletResponse response) throws SQLException, JRException, IOException {

        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+tenant,"postgres","12345");
        InputStream stream = this.getClass().getResourceAsStream("/reports/salesReports/allSalesForClient.jasper");
        HashMap<String, Object> params = new HashMap<>();
        params.put("SUCURSAL", id);
        params.put("CLIENTE_ID", client);
        JasperReport report = (JasperReport) JRLoader.loadObject(stream);
        JasperPrint print = JasperFillManager.fillReport(report,params,conn);
        final ServletOutputStream output = response.getOutputStream();
        JasperExportManager.exportReportToPdfStream(print, output);

        return null;
    }

    @Override
    public JasperPrint salesForDateReport(String tenant, Long id, String firstDate, String secondDate,HttpServletResponse response) throws JRException, IOException {
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        Iterable<ComprobanteFiscal> receipts = dao.findAll();
        ArrayList<PrintSalesReport> data = new ArrayList<>();
        for(ComprobanteFiscal c: receipts){
            PrintSalesReport detail = new PrintSalesReport();
            try {
                Date date = format.parse(c.getFechaEmision());
                if(date.getTime() >= Double.parseDouble(firstDate) && date.getTime() <= Double.parseDouble(secondDate)){
                    if(c.getSucursal().getId() == id &&
                            c.getDocumentoComercial().getCodigoDocumento().equals("001") ||
                            c.getDocumentoComercial().getCodigoDocumento().equals("006") ||
                            c.getDocumentoComercial().getCodigoDocumento().equals("011") ||
                            c.getDocumentoComercial().getCodigoDocumento().equals("081") ||
                            c.getDocumentoComercial().getCodigoDocumento().equals("082") ||
                            c.getDocumentoComercial().getCodigoDocumento().equals("111") ||
                            c.getDocumentoComercial().getCodigoDocumento().equals("9999")){
                        System.out.println("Sel prro");
                        detail.setFechaEmision(c.getFechaEmision());
                        detail.setCliente(c.getCliente().getRazonSocial());
                        detail.setPuntoVenta(c.getPuntoVenta().getNombre());
                        detail.setNombreDocumento(c.getNombreDocumento());
                        detail.setTotalVenta(c.getTotalVenta());

                        data.add(detail);
                    }
                }
            } catch (ParseException e) {
                System.out.println("Formato de fecha inválido");
            }
        }

        InputStream stream = this.getClass().getResourceAsStream("/reports/salesReports/salesForDate.jasper");
        JRBeanCollectionDataSource datasource = new JRBeanCollectionDataSource(data);
        HashMap<String, Object> params = new HashMap<>();
        JasperReport report = (JasperReport) JRLoader.loadObject(stream);
        JasperPrint print = JasperFillManager.fillReport(report,params,datasource);
        final ServletOutputStream output = response.getOutputStream();
        JasperExportManager.exportReportToPdfStream(print, output);

        return null;
    }

    @Override
    public JasperPrint closeSaleReport(ComprobanteFiscal request, String tenant, HttpServletResponse response) throws IOException, JRException {

        if(request.getCae() != ""){
            String detailRoute = Paths.get("","src","main","resources", "reports/receiptsReports/factura_detail.jasper").toString();
            InputStream stream = this.getClass().getResourceAsStream("/reports/receiptsReports/factura_electronica.jasper");
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            String fechaInicioAct = format.format(request.getSucursal().getFechaInicioAct());
            PrintComprobante comprobante = new PrintComprobante();
            comprobante.setBarCode(request.getBarCode());
            comprobante.setCae(request.getCae());
            comprobante.setFechaEmision(request.getFechaEmision());
            comprobante.setFechaVto(request.getFechaVto());
            comprobante.setLetra(request.getLetra());
            comprobante.setClienteCondicionIva(request.getCliente().getCondicionIva().getNombre());
            comprobante.setClienteCuit(request.getCliente().getCuit());
            comprobante.setClienteDireccion(request.getCliente().getDireccion());
            comprobante.setClienteRazonSocial(request.getCliente().getRazonSocial());
            comprobante.setCondicionVenta(request.getCondicionVenta());
            comprobante.setNumeroCbte(request.getNumeroCbte());
            comprobante.setIdPuntoVenta(request.getPuntoVenta().getIdFiscal());
            comprobante.setEmpresaCondicionIva(request.getSucursal().getCondicionIva().getNombre());
            comprobante.setEmpresaCuit(request.getSucursal().getCuit());
            comprobante.setEmpresaDireccion(request.getSucursal().getDireccion());
            comprobante.setEmpresaFechaInicioAct(fechaInicioAct);
            comprobante.setEmpresaRazonSocial(request.getSucursal().getRazonSocial());
            comprobante.setEmpresaTelefono(request.getSucursal().getTelefono());
            comprobante.setEmpresaIngBruto(request.getSucursal().getIngBruto());
            comprobante.setProductos(request.getProductos());
            comprobante.setTotalVenta(request.getTotalVenta());
            comprobante.setNombreDocumento(request.getNombreDocumento());
            List<PrintComprobante> data = new ArrayList<>();
            data.add(comprobante);
            JRBeanCollectionDataSource subreportDataSource = new JRBeanCollectionDataSource(comprobante.getProductos());
            JRBeanCollectionDataSource datasource = new JRBeanCollectionDataSource(data);
            HashMap<String, Object> params = new HashMap<>();
            params.put("SUBREPORT_DIR", detailRoute);
            params.put("SUBREPORT_DATA", subreportDataSource);
            params.put("TOTAL_VENTA", comprobante.getTotalVenta().toString());
            JasperReport report = (JasperReport) JRLoader.loadObject(stream);
            JasperPrint print = JasperFillManager.fillReport(report,params,datasource);
            final ServletOutputStream output = response.getOutputStream();
            JasperExportManager.exportReportToPdfStream(print, output);
        }else{
            String detailRoute = Paths.get("","src","main","resources", "reports/receiptsReports/ticket_detail.jasper").toString();
            InputStream stream = this.getClass().getResourceAsStream("/reports/receiptsReports/x_ticket.jasper");
            SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
            String fechaInicioAct = format.format(request.getSucursal().getFechaInicioAct());
            PrintComprobante comprobante = new PrintComprobante();
            comprobante.setBarCode(request.getBarCode());
            comprobante.setCae(request.getCae());
            comprobante.setFechaEmision(request.getFechaEmision());
            comprobante.setFechaVto(request.getFechaVto());
            comprobante.setLetra(request.getLetra());
            comprobante.setClienteCondicionIva(request.getCliente().getCondicionIva().getNombre());
            comprobante.setClienteCuit(request.getCliente().getCuit());
            comprobante.setClienteDireccion(request.getCliente().getDireccion());
            comprobante.setClienteRazonSocial(request.getCliente().getRazonSocial());
            comprobante.setCondicionVenta(request.getCondicionVenta());
            comprobante.setNumeroCbte(request.getNumeroCbte());
            comprobante.setIdPuntoVenta(request.getPuntoVenta().getIdFiscal());
            comprobante.setEmpresaCondicionIva(request.getSucursal().getCondicionIva().getNombre());
            comprobante.setEmpresaCuit(request.getSucursal().getCuit());
            comprobante.setEmpresaDireccion(request.getSucursal().getDireccion());
            comprobante.setEmpresaFechaInicioAct(fechaInicioAct);
            comprobante.setEmpresaRazonSocial(request.getSucursal().getRazonSocial());
            comprobante.setEmpresaTelefono(request.getSucursal().getTelefono());
            comprobante.setEmpresaIngBruto(request.getSucursal().getIngBruto());
            comprobante.setProductos(request.getProductos());
            comprobante.setTotalVenta(request.getTotalVenta());
            comprobante.setNombreDocumento(request.getNombreDocumento());
            List<PrintComprobante> data = new ArrayList<>();
            data.add(comprobante);
            JRBeanCollectionDataSource subreportDataSource = new JRBeanCollectionDataSource(comprobante.getProductos());
            JRBeanCollectionDataSource datasource = new JRBeanCollectionDataSource(data);
            HashMap<String, Object> params = new HashMap<>();
            params.put("SUBREPORT_DIR", detailRoute);
            params.put("SUBREPORT_DATA", subreportDataSource);
            params.put("TOTAL_VENTA", comprobante.getTotalVenta().toString());
            JasperReport report = (JasperReport) JRLoader.loadObject(stream);
            JasperPrint print = JasperFillManager.fillReport(report,params,datasource);
            final ServletOutputStream output = response.getOutputStream();
            JasperExportManager.exportReportToPdfStream(print, output);
        }

        return null;
    }
}
