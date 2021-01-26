package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Iva;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IvaDao extends PagingAndSortingRepository<Iva, Long> {
}
