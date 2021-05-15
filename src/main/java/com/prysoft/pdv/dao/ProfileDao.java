package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Profile;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ProfileDao extends PagingAndSortingRepository<Profile, Long> {
}
