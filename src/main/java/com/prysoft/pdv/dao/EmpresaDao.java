package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Empresa;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface EmpresaDao extends PagingAndSortingRepository<Empresa, Long> {
}
