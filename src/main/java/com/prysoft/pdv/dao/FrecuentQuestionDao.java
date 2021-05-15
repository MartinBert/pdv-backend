package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.FrecuentQuestion;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FrecuentQuestionDao extends PagingAndSortingRepository<FrecuentQuestion, Long> {
}
