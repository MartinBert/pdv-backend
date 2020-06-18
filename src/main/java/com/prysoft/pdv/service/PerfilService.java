package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.PerfilFilter;
import com.prysoft.pdv.models.Perfil;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PerfilService {

    Perfil findById(Long id);

    Page<Perfil> findAll(Pageable page);

    Perfil saveOrUpdate(Perfil entity);

    Page<Perfil> filter(PerfilFilter filter);

    void delete(Long id);

}
