package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Atributo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AtributoDao extends PagingAndSortingRepository<Atributo, Long> {
}
