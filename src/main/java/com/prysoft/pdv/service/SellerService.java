package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.SellerFilter;
import com.prysoft.pdv.models.Seller;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface SellerService {

    Seller findById(Long id);

    Page<Seller> findAll(Pageable page);

    Seller saveOrUpdate(Seller entity);

    Page<Seller> filter(SellerFilter filterParam);

    void delete(Long id);
}
