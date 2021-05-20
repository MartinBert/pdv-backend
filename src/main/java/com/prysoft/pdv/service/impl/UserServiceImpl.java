package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.UserDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.UserFilter;
import com.prysoft.pdv.models.User;
import com.prysoft.pdv.service.UserService;
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
public class UserServiceImpl extends FilterService<User> implements UserService {
    @Autowired
    private UserDao dao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public User findById(Long id) {
        Optional<User> optional = dao.findById(id);
        if (!optional.isPresent()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
    public Page<User> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public User findByUsername(String username) {
        return dao.findOneByUsername(username);
    }

    @Override
    public User saveOrUpdate(User entity) {
        User u = dao.findOneByUsername(entity.getUsername());
        if (entity.getId() == null) {//User nuevo
            if (u != null) {
                throw new EntityNotFoundException("El nombre de usuario ya existe");
            }
            entity.setPassword(passwordEncoder.encode(entity.getPassword()));
        } else {//Actualiza el usuario
            if (u != null && !entity.getId().equals(u.getId())) {
                throw new EntityNotFoundException("El nombre de usuario ya existe");
            } else {
                if (entity.getPassword() == null) {
                    Optional<User> optional = dao.findById(entity.getId());
                    User user = optional.get();
                    entity.setPassword(user.getPassword());
                } else {
                    entity.setPassword(passwordEncoder.encode(entity.getPassword()));
                }
            }
        }

        return dao.save(entity);
    }

    @Override
    public User update(User entity) {
        Optional<User> userCoincidence = dao.findById(entity.getId());

        if (userCoincidence.isPresent()) {
            try {
                User user = userCoincidence.get();
                System.out.println(user.getPassword());
                System.out.println(passwordEncoder.encode(entity.getPassword()));
                if (user.getPassword().equals(passwordEncoder.encode(entity.getPassword()))) {
                    System.out.println("Coincidence");
                    return saveOrUpdate(entity);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<User> filter(UserFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        if (filterParam.getEmpresaId() == null) {
            hql =
                    "WHERE LOWER(c.nombre) LIKE LOWER('" + filterParam.getUsuarioName() + "%') " +
                            "AND (LOWER(c.sucursal.razonSocial) LIKE LOWER('" + filterParam.getSucursalSocialReason() + "%') " +
                            "AND LOWER(c.perfil.nombre) LIKE LOWER('" + filterParam.getPerfilName() + "%') " +
                            "AND LOWER(c.puntoVenta.nombre) LIKE LOWER('" + filterParam.getPuntoVentaName() + "%'))";
        } else {
            hql =
                    "WHERE (c.empresa.id) = ('" + filterParam.getEmpresaId() + "') " +
                            "AND (LOWER(c.sucursal.razonSocial) LIKE LOWER('" + filterParam.getSucursalSocialReason() + "%') " +
                            "AND LOWER(c.perfil.nombre) LIKE LOWER('" + filterParam.getPerfilName() + "%') " +
                            "AND LOWER(c.puntoVenta.nombre) LIKE LOWER('" + filterParam.getPuntoVentaName() + "%'))";
        }

        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }
}
