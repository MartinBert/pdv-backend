package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Seller;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SellerDao extends PagingAndSortingRepository<Seller, Long> {
}

