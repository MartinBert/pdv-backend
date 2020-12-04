package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.Transportista;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TransportistaService {

    Transportista findById(Long id);

    Page<Transportista> findAll(Pageable page);

    Transportista saveOrUpdate(Transportista entity);

    Page<Transportista> filter(GenericFilter filterParam);

    void delete(Long id);
}
