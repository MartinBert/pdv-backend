package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.InvoiceFilter;
import com.prysoft.pdv.models.Invoice;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;
import java.util.List;

public interface InvoiceService {

    Invoice findById(Long id);

    Invoice findByNumeroCbte(String numero);

    Page<Invoice> findAll(Pageable page);

    Invoice saveOrUpdate(Invoice entity);

    Page<Invoice> filter(InvoiceFilter filterParam);

    List<Invoice> getInvoicesForDateRange(InvoiceFilter filterParam);

    void delete(Long id);

    Iterable<Invoice> saveOrUpdateAll(ArrayList<Invoice> entities);
}
