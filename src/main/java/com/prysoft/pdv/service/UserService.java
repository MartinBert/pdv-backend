package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.UserFilter;
import com.prysoft.pdv.models.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface UserService {

    User findById(Long id);

    User findByUsername(String username);

    Page<User> findAll(Pageable page);

    User saveOrUpdate(User entity);

    User update(User entity);

    Page<User> filter(UserFilter filter);

    void delete(Long id);

}
