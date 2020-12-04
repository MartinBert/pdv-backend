package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.Usuario;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UsuarioService {

    Usuario findById(Long id);

    Usuario findByUsername(String username);

    Page<Usuario> findAll(Pageable page);

    Usuario saveOrUpdate(Usuario entity);

    Page<Usuario> filter(GenericFilter filter);

    void delete(Long id);

}
