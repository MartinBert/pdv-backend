package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.FrecuentQuestionFilter;
import com.prysoft.pdv.models.FrecuentQuestion;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface FrecuentQuestionService {

    FrecuentQuestion findById(Long id);

    Page<FrecuentQuestion> findAll(Pageable page);

    FrecuentQuestion saveOrUpdate(FrecuentQuestion entity);

    void delete(Long id);

    Page<FrecuentQuestion> filter(FrecuentQuestionFilter filterParam);
}
