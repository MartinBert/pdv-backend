package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.DocumentoComercialFilter;
import com.prysoft.pdv.models.DocumentoComercial;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface DocumentoComercialService {

    DocumentoComercial findById(Long id);

    Page<DocumentoComercial> findAll(Pageable page);

    DocumentoComercial saveOrUpdate(DocumentoComercial entity);

    Page<DocumentoComercial> filter(DocumentoComercialFilter filter);

    void delete(Long id);
}