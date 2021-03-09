package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.VentaFilter;
import com.prysoft.pdv.models.ComprobanteFiscal;
import org.springframework.data.domain.Page;

import java.util.ArrayList;


public interface VentaService {
    Page<ComprobanteFiscal> filter(VentaFilter filterParam);
    ArrayList<ComprobanteFiscal> filterNotCloseReceipts(VentaFilter filterParam);
}

