package com.prysoft.pdv.helpers;

import com.prysoft.pdv.models.Invoice;
import com.prysoft.pdv.models.PrintComprobante;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.stream.DoubleStream;

@Service
public class InvoicePrintHelper implements Serializable {
    @Autowired
    private DateHelper dateHelper;

    public PrintComprobante processReceiptForPrint(Invoice receipt) {
        String fechaInicioAct = dateHelper.dateToStringConvertion(receipt.getSucursal().getFechaInicioAct());
        DoubleStream streamIvas = DoubleStream.of(receipt.getTotalIva21(), receipt.getTotalIva10(), receipt.getTotalIva27());
        DoubleStream streamPorcentajeDescuentos = DoubleStream.of(receipt.getPorcentajeDescuentoPlan(), receipt.getPorcentajeDescuentoGlobal());
        DoubleStream streamPorcentajeRecargos = DoubleStream.of(receipt.getPorcentajeRecargoPlan(), receipt.getPorcentajeRecargoGlobal());
        DoubleStream streamMontoDescuentos = DoubleStream.of(receipt.getTotalDescuentoPlan(), receipt.getTotalDescuentoGlobal());
        DoubleStream streamMontoRecargos = DoubleStream.of(receipt.getTotalRecargoPlan(), receipt.getTotalRecargoGlobal());
        Double totalIva = streamIvas.sum();
        Double totalPorcentajeDescuento = streamPorcentajeDescuentos.sum();
        Double totalPorcentajeRecargo = streamPorcentajeRecargos.sum();
        Double totalRecargoGlobal = streamMontoRecargos.sum();
        Double totalDescuentoGlobal = streamMontoDescuentos.sum();
        PrintComprobante comprobante = new PrintComprobante();

        comprobante.setBarCode(receipt.getBarCode());
        comprobante.setCae(receipt.getCae());
        comprobante.setFechaEmision(receipt.getFechaEmision());
        comprobante.setFechaVto(receipt.getFechaVto());
        comprobante.setLetra(receipt.getLetra());
        comprobante.setLogoUrl(receipt.getLogoUrl());
        comprobante.setClienteCondicionIva(receipt.getCliente().getCondicionIva().getNombre());
        comprobante.setClienteCuit(receipt.getCliente().getCuit());
        comprobante.setClienteDireccion(receipt.getCliente().getDireccion());
        comprobante.setClienteRazonSocial(receipt.getCliente().getRazonSocial());
        comprobante.setCondicionVenta(receipt.getCondicionVenta());
        comprobante.setNumeroCbte(receipt.getNumeroCbte());
        comprobante.setIdPuntoVenta(receipt.getPuntoVenta().getIdFiscal());
        comprobante.setEmpresaCondicionIva(receipt.getSucursal().getCondicionIva().getNombre());
        comprobante.setEmpresaCuit(receipt.getSucursal().getCuit());
        comprobante.setEmpresaDireccion(receipt.getSucursal().getDireccion());
        comprobante.setEmpresaFechaInicioAct(fechaInicioAct);
        comprobante.setEmpresaRazonSocial(receipt.getSucursal().getRazonSocial());
        comprobante.setEmpresaTelefono(receipt.getSucursal().getTelefono());
        comprobante.setEmpresaIngBruto(receipt.getSucursal().getIngBruto());
        comprobante.setProductos(receipt.getProductos());
        comprobante.setTotalVenta(receipt.getTotalVenta());
        comprobante.setNombreDocumento(receipt.getNombreDocumento());
        comprobante.setClienteLocalidad(receipt.getCliente().getNombreRegion());
        comprobante.setCodigoDocumento(receipt.getDocumentoComercial().getCodigoDocumento());
        comprobante.setTotalDescuentoGlobal(receipt.getTotalDescuentoGlobal());
        comprobante.setTotalIva21(receipt.getTotalIva21());
        comprobante.setTotalIva10(receipt.getTotalIva10());
        comprobante.setTotalIva27(receipt.getTotalIva27());
        comprobante.setTotalDescuentoGlobal(totalDescuentoGlobal);
        comprobante.setPorcentajeDescuentoGlobal(totalPorcentajeDescuento);
        comprobante.setTotalRecargoGlobal(totalRecargoGlobal);
        comprobante.setPorcentajeRecargoGlobal(totalPorcentajeRecargo);
        comprobante.setSubTotal(receipt.getSubTotal());
        comprobante.setTotalIva(totalIva);
        return comprobante;
    }
}
