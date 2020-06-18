package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.UsuarioDao;
import com.prysoft.pdv.models.Usuario;
import com.prysoft.pdv.security.UserDetailsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.management.relation.Role;
import java.util.HashSet;
import java.util.Set;

@Service
@Qualifier("userDetailsService")
public class UsuarioDetalleServiceImpl implements UserDetailsService {
    @Autowired
    private UsuarioDao dao;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        final Usuario retrievedUser = dao.findOneByUsername(userName);
        //para comprobar
        if (retrievedUser != null) System.out.println(retrievedUser.getUsername());
        if (retrievedUser == null) {
            throw new UsernameNotFoundException("Invalid username or password");
        }
        return UserDetailsMapper.build(retrievedUser);
    }
}

