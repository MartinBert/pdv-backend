package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.models.ComprobanteFiscal;
import com.prysoft.pdv.models.PrintComprobante;
import com.prysoft.pdv.service.VentaService;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Service
@Transactional
public class VentaServiceImpl implements VentaService {

    @Override
    public JasperPrint closeSaleReport(ComprobanteFiscal request, String tenant, HttpServletResponse response) throws IOException, JRException, ParseException {

        if(request.getCae() != ""){
            String detailRoute = Paths.get("","src","main","resources", "reports/factura_detail.jasper").toString();
            InputStream stream = this.getClass().getResourceAsStream("/reports/factura_electronica.jasper");
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
            List<PrintComprobante> data = new ArrayList<>();
            data.add(comprobante);
            System.out.println(comprobante);
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
            String detailRoute = Paths.get("","src","main","resources","reports", "ticket_detail.jasper").toString();
            InputStream stream = this.getClass().getResourceAsStream("/reports/x_ticket.jasper");
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

