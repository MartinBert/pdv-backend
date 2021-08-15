package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.ZClosure;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ZClosureDao extends PagingAndSortingRepository<ZClosure, Long> {
    Optional<ZClosure> findLastBySucursalId(Long sucursalId);
}
