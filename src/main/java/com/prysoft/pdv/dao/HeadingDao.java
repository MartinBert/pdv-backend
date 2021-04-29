package com.prysoft.pdv.dao;


import com.prysoft.pdv.models.Heading;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface HeadingDao extends PagingAndSortingRepository<Heading, Long> {
}
