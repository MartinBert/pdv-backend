package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.UsuarioDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.RubroFilter;
import com.prysoft.pdv.dto.UsuarioFilter;
import com.prysoft.pdv.models.Rubro;
import com.prysoft.pdv.models.Usuario;
import com.prysoft.pdv.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class UsuarioServiceImpl extends FilterService<Usuario> implements UsuarioService {
    @Autowired
    private UsuarioDao dao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public Usuario findById(Long id) {
        Optional<Usuario> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
    public Page<Usuario> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Usuario findByUsername(String username){return dao.findOneByUsername(username);}

    @Override
    public Usuario saveOrUpdate(Usuario entity) {
        Usuario u = dao.findOneByUsername(entity.getUsername());
        if(entity.getId() == null){//Usuario nuevo
            if(u != null){
                throw new EntityNotFoundException("El nombre de usuario ya existe");
            }
            entity.setPassword(passwordEncoder.encode(entity.getPassword()));
        }
        else {//Actualiza el usuario
            if(u != null && !entity.getId().equals(u.getId())){
                throw new EntityNotFoundException("El nombre de usuario ya existe");
            }
            else {
                if(entity.getPassword() == null){
                    Optional<Usuario> optional = dao.findById(entity.getId());
                    Usuario user = optional.get();
                    entity.setPassword(user.getPassword());
                }
                else {
                    entity.setPassword(passwordEncoder.encode(entity.getPassword()));
                }
            }
        }

        return dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<Usuario> filter(UsuarioFilter filter) {
        StringBuilder hql = new StringBuilder();
        List<FilterParam> params = new ArrayList<>();

        hql
                .append("WHERE LOWER(c.nombre) LIKE LOWER('")
                .append(filter.getNombre())
                .append("%')");

        return getPage(hql.toString(), filter.getPage(), filter.getSize(), params);
    }
}
