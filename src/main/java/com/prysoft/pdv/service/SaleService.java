package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.SaleFilter;
import com.prysoft.pdv.models.Invoice;
import org.springframework.data.domain.Page;

import java.util.ArrayList;

public interface SaleService {
    Page<Invoice> filter(SaleFilter filterParam);
    ArrayList<Invoice> filterNotCloseReceipts(SaleFilter filterParam);
}

