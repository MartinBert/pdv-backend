package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.TransportistaFilter;
import com.prysoft.pdv.models.Transportista;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface TransportistaService {

    Transportista findById(Long id);

    Page<Transportista> findAll(Pageable page);

    Transportista saveOrUpdate(Transportista entity);

    Page<Transportista> filter(TransportistaFilter filterParam);

    void delete(Long id);
}
