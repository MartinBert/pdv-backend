package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.ComprobanteFiscal;
import org.springframework.data.domain.Page;


public interface VentaService {
    Page<ComprobanteFiscal> filter(GenericFilter filterParam);
}

