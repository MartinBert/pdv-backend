package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.PreguntaFrecuente;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PreguntaFrecuenteService {

    PreguntaFrecuente findById(Long id);

    Page<PreguntaFrecuente> findAll(Pageable page);

    PreguntaFrecuente saveOrUpdate(PreguntaFrecuente entity);

    void delete(Long id);

    Page<PreguntaFrecuente> filter(GenericFilter filterParam);
}
