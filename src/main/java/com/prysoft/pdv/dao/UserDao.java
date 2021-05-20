package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends PagingAndSortingRepository<User, Long> {
    User findOneByUsername(String username);
}
