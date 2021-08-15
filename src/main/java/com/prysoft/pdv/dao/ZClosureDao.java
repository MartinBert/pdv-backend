package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.ZClosure;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZClosureDao extends PagingAndSortingRepository<ZClosure, Long> {
}
