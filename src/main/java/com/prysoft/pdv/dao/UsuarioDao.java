package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Usuario;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioDao extends PagingAndSortingRepository<Usuario, Long> {

    Usuario findOneByUsername(String username);

}
