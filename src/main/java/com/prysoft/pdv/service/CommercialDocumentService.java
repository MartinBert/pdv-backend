package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.CommercialDocumentFilter;
import com.prysoft.pdv.models.CommercialDocument;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;

public interface CommercialDocumentService {

    CommercialDocument findById(Long id);

    Page<CommercialDocument> findAll(Pageable page);

    Iterable<CommercialDocument> saveAll(ArrayList<CommercialDocument> entities);

    CommercialDocument saveOrUpdate(CommercialDocument entity);

    Page<CommercialDocument> filter(CommercialDocumentFilter filterParam);

    void delete(Long id);

    Iterable<CommercialDocument> getInvoices();
}
