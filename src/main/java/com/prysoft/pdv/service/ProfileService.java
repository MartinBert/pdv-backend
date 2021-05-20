package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.ProfileFilter;
import com.prysoft.pdv.models.Profile;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ProfileService {

    Profile findById(Long id);

    Page<Profile> findAll(Pageable page);

    Profile saveOrUpdate(Profile entity);

    Page<Profile> filter(ProfileFilter filterParam);

    void delete(Long id);

}
