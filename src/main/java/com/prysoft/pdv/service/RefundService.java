package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.RefundFilter;
import com.prysoft.pdv.models.Refund;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface RefundService {

    Refund findById(Long id);

    Page<Refund> findAll(Pageable page);

    Refund saveOrUpdate(Refund entity);

    Page<Refund> filter(RefundFilter filterParam);

    void delete(Long id);
}
