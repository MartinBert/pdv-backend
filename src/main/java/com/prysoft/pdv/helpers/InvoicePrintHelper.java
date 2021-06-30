package com.prysoft.pdv.helpers;

import com.prysoft.pdv.models.Invoice;
import com.prysoft.pdv.models.PrintComprobante;
import com.prysoft.pdv.models.PrintComprobanteDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class InvoicePrintHelper implements Serializable {
    @Autowired
    private DateHelper dateHelper;

    public PrintComprobante processReceiptForPrint(Invoice receipt) {
        String fechaInicioAct = dateHelper.dateToStringConvertion(receipt.getSucursal().getFechaInicioAct());
        PrintComprobante comprobante = new PrintComprobante();
        for (PrintComprobanteDetail product: receipt.getProductos()){
            product.setPrecioUnitario(Math.round((product.getPrecioUnitario() / 1.21) * 100.0) / 100.0);
            product.setPrecioTotal(Math.round((product.getPrecioTotal() / 1.21) * 100.0) / 100.0);
        }
        Double totalIva = Math.round((receipt.getTotalVenta() - (receipt.getTotalVenta() / 1.21)) * 100.0) / 100.0;
        Double subTotal = Math.round((receipt.getTotalVenta() / 1.21) * 100.0) / 100.0;
        comprobante.setBarCode(receipt.getBarCode());
        comprobante.setCae(receipt.getCae());
        comprobante.setFechaEmision(receipt.getFechaEmision());
        comprobante.setFechaVto(receipt.getFechaVto());
        comprobante.setLetra(receipt.getLetra());
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
        comprobante.setSubTotal(subTotal);
        comprobante.setTotalIva(totalIva);
        return comprobante;
    }
}
