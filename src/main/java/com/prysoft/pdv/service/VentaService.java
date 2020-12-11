package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.ComprobanteFiscal;
import org.springframework.data.domain.Page;

import java.util.ArrayList;


public interface VentaService {
    Page<ComprobanteFiscal> filter(GenericFilter filterParam);
    ArrayList<ComprobanteFiscal> filterNotCloseReceipts(GenericFilter filterParam);
}

