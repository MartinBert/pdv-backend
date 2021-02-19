package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Atributo;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AtributoDao extends PagingAndSortingRepository<Atributo, Long> {
    Optional<Atributo> findByValor(String valor);
    Optional<Atributo> findByValorNumerico(double valorNumerico);
}
