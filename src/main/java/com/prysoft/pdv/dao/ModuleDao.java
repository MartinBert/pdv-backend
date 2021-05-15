package com.prysoft.pdv.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import com.prysoft.pdv.models.Module;

@Repository
public interface ModuleDao extends PagingAndSortingRepository<Module, Long> {
}
