package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Attribute;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AttributeDao extends PagingAndSortingRepository<Attribute, Long> {
    Optional<Attribute> findByValor(String valor);
    Optional<Attribute> findByValorNumerico(double valorNumerico);
}
