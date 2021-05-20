package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.CommercialDocument;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CommercialDocumentDao extends PagingAndSortingRepository<CommercialDocument, Long> {
}
