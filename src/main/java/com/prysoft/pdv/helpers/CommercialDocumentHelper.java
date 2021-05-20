package com.prysoft.pdv.helpers;

import com.prysoft.pdv.models.CommercialDocument;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class CommercialDocumentHelper implements Serializable {
    public boolean checkReceiptIsInvoice(CommercialDocument document) {
        return document.getCodigoDocumento().equals("001") ||
                document.getCodigoDocumento().equals("006") ||
                document.getCodigoDocumento().equals("011") ||
                document.getCodigoDocumento().equals("081") ||
                document.getCodigoDocumento().equals("082") ||
                document.getCodigoDocumento().equals("111") ||
                document.getCodigoDocumento().equals("9999");
    }
}
