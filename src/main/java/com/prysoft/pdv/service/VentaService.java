package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.VentaFilter;
import com.prysoft.pdv.models.ComprobanteFiscal;
import org.springframework.data.domain.Page;


public interface VentaService {
    Page<ComprobanteFiscal> filter(String id, int page, int size);
    Page<ComprobanteFiscal> filterVentas(VentaFilter request);
}

