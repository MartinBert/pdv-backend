package com.prysoft.pdv.helpers;

import com.prysoft.pdv.models.DocumentoComercial;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class DocumentoComercialHelper implements Serializable {
    public boolean checkReceiptIsInvoice(DocumentoComercial document) {
        if (document.getCodigoDocumento().equals("001") ||
                document.getCodigoDocumento().equals("006") ||
                document.getCodigoDocumento().equals("011") ||
                document.getCodigoDocumento().equals("081") ||
                document.getCodigoDocumento().equals("082") ||
                document.getCodigoDocumento().equals("111") ||
                document.getCodigoDocumento().equals("9999")) {
            return true;
        } else {
            return false;
        }
    }
}
