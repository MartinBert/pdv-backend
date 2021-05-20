package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.FrecuentQuestionDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.FrecuentQuestionFilter;
import com.prysoft.pdv.models.FrecuentQuestion;
import com.prysoft.pdv.service.FrecuentQuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class FrecuentQuestionServiceImpl extends FilterService<FrecuentQuestion> implements FrecuentQuestionService {
    @Autowired
    private FrecuentQuestionDao dao;

    @Override
    public FrecuentQuestion findById(Long id) {
        Optional<FrecuentQuestion> optional = dao.findById(id);
        if (!optional.isPresent()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
    public Page<FrecuentQuestion> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public FrecuentQuestion saveOrUpdate(FrecuentQuestion entity) {
        return dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<FrecuentQuestion> filter(FrecuentQuestionFilter filterParam) {
        List<FilterParam> params = new ArrayList<>();
        String hql =
                "WHERE LOWER(c.pregunta) LIKE LOWER('" + filterParam.getPreguntaFrecuenteQuestion() + "%') " +
                        "AND LOWER(c.respuesta) LIKE LOWER('" + filterParam.getPreguntaFrecuenteResponse() + "%')";
        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }
}
