package com.prysoft.pdv.dao;


import com.prysoft.pdv.models.Print;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrintDao extends PagingAndSortingRepository<Print, Long> {
}
