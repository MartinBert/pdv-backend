package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.DocumentoComercial;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface DocumentoComercialDao extends PagingAndSortingRepository<DocumentoComercial, Long> {
}
