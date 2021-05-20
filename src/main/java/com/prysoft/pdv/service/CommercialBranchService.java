package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.CommercialBranchFilter;
import com.prysoft.pdv.models.CommercialBranch;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CommercialBranchService {

    CommercialBranch findById(Long id);

    Page<CommercialBranch> findAll(Pageable page);

    CommercialBranch saveOrUpdate(CommercialBranch entity);

    Page<CommercialBranch> filter(CommercialBranchFilter filterParam);

    void delete(Long id);
}
