package com.prysoft.pdv.helpers;

import com.prysoft.pdv.models.PaymentMethodDetail;
import com.prysoft.pdv.models.ZClosure;
import com.prysoft.pdv.print.DetailOfPaymentMethodsForPrintInZClosure;
import com.prysoft.pdv.print.PrintZCLosure;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

@Service
public class ZClosureHelper implements Serializable {
    private static final long serialVersionUID = 999999999999999999L;

    public PrintZCLosure formatObjectForPrint(ZClosure zClosure){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/YYYY");
        SimpleDateFormat simpleHourFormat = new SimpleDateFormat("HH:mm:ss");
        ArrayList<DetailOfPaymentMethodsForPrintInZClosure> paymentMethodsDetail = new ArrayList<>();
        for (PaymentMethodDetail paymentMethodDetail: zClosure.getDetalleMediosPago()){
            DetailOfPaymentMethodsForPrintInZClosure detail = new DetailOfPaymentMethodsForPrintInZClosure();
            detail.setPaymentMethodName(paymentMethodDetail.getMedioPago().getNombre());
            detail.setTotal(paymentMethodDetail.getTotal());
            detail.setImporteTotalIva(paymentMethodDetail.getImporteTotalIva());
            detail.setTotalIva10(paymentMethodDetail.getTotalIva10());
            detail.setTotalIva21(paymentMethodDetail.getTotalIva21());
            detail.setTotalIva27(paymentMethodDetail.getTotalIva27());
            paymentMethodsDetail.add(detail);
        }

        PrintZCLosure printZCLosure = new PrintZCLosure();
        printZCLosure.setBusinessSocialReason(zClosure.getEmpresa().getRazonSocial());
        printZCLosure.setCommercialBranchSocialReason(zClosure.getSucursal().getRazonSocial());
        printZCLosure.setCommercialBranchCuit(zClosure.getSucursal().getCuit());
        printZCLosure.setCommercialBranchDirection(zClosure.getSucursal().getDireccion());
        printZCLosure.setCommercialBranchIvaCondition(zClosure.getSucursal().getCondicionIva().getNombre());
        printZCLosure.setIssueDate(simpleDateFormat.format(zClosure.getFecha()));
        printZCLosure.setIssueHour(simpleHourFormat.format(zClosure.getFecha()));
        printZCLosure.setReceiptNumber(zClosure.getId().toString());
        printZCLosure.setPaymentMethodsDetail(paymentMethodsDetail);
        printZCLosure.setTotal(zClosure.getTotal());
        printZCLosure.setTotalIva(zClosure.getTotalSumatoriaIva());
        printZCLosure.setTotalIva21(zClosure.getTotalIva21());
        printZCLosure.setTotalIva10(zClosure.getTotalIva10());
        printZCLosure.setTotalIva27(zClosure.getTotalIva27());
        printZCLosure.setCantidadVentas(zClosure.getCantidadVentas());
        return printZCLosure;
    }
}
