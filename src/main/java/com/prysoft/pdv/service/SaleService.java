package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.SaleFilter;
import com.prysoft.pdv.models.Invoice;
import org.springframework.data.domain.Page;

import javax.swing.text.html.InlineView;
import java.util.ArrayList;

public interface SaleService {
    Page<Invoice> filter(SaleFilter filterParam);
    ArrayList<Invoice> filterNotCloseReceipts(SaleFilter filterParam);
    Page<Invoice> getUniqueDateSales(SaleFilter filterParam);
    Page<Invoice> getPresupuestos(SaleFilter filterParam);
    Page<Invoice>getRemitos(SaleFilter filterParam);
    String getPreviousCorrelativeDocumentNumber(Long sucursalId, String codigoDocumento);
}

