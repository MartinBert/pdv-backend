package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.FiscalConditionFilter;
import com.prysoft.pdv.models.FiscalCondition;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FiscalConditionService {

    FiscalCondition findById(Long id);

    Page<FiscalCondition> findAll(Pageable page);

    FiscalCondition saveOrUpdate(FiscalCondition entity);

    Page<FiscalCondition> filter(FiscalConditionFilter filterParam);

    void delete(Long id);
}
