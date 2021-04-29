package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Invoice;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface InvoiceDao extends PagingAndSortingRepository<Invoice, Long> {
    Optional<Invoice> findByNumeroCbte(String numero);
}
