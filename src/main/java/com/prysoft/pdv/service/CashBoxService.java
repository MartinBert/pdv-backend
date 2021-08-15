package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.CashBoxFilter;
import com.prysoft.pdv.models.CashBox;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

public interface CashBoxService {
    CashBox findById(Long id);

    int findLastBySucursalId(Long id);

    Page<CashBox> findAll(Pageable page);

    CashBox saveOrUpdate(CashBox entity);

    void delete(Long id);

    Page<CashBox> filter(CashBoxFilter filterParam);
}
