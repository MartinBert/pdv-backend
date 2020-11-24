package com.prysoft.pdv.helpers;

import com.prysoft.pdv.models.ComprobanteFiscal;
import com.prysoft.pdv.print.PrintSalesReport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class PrintSalesHelper implements Serializable {
    @Autowired
    private MedioPagoHelper medioHelper;

    public PrintSalesReport processReceiptForPrint(ComprobanteFiscal receipt){
        PrintSalesReport report = new PrintSalesReport();
        String medios = medioHelper.stringPaymentMethodsNameConvertion(receipt.getMediosPago());

        report.setFechaEmision(receipt.getFechaEmision());
        report.setCliente(receipt.getCliente().getRazonSocial());
        report.setPuntoVenta(receipt.getPuntoVenta().getNombre());
        report.setNombreDocumento(receipt.getNombreDocumento());
        report.setTotalVenta(receipt.getTotalVenta());
        report.setMedioPago(medios);

        return report;
    }
}
