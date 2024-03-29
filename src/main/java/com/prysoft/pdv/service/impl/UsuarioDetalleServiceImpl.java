package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.UserDao;
import com.prysoft.pdv.models.User;
import com.prysoft.pdv.security.UserDetailsMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@Qualifier("userDetailsService")
public class UsuarioDetalleServiceImpl implements UserDetailsService {
    @Autowired
    private UserDao dao;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        final User retrievedUser = dao.findOneByUsername(userName);
        //para comprobar
        if (retrievedUser != null) System.out.println(retrievedUser.getUsername());
        if (retrievedUser == null) {
            throw new UsernameNotFoundException("Invalid username or password");
        }
        return UserDetailsMapper.build(retrievedUser);
    }
}

