package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.FiscalConditionDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.FiscalConditionFilter;
import com.prysoft.pdv.models.FiscalCondition;
import com.prysoft.pdv.service.FiscalConditionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class FiscalConditionServiceImpl extends FilterService<FiscalCondition> implements FiscalConditionService {

    @Autowired
    private FiscalConditionDao dao;

    @Override
    public FiscalCondition findById(Long id) {
        Optional<FiscalCondition> optional = dao.findById(id);
        if (!optional.isPresent()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public Page<FiscalCondition> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public FiscalCondition saveOrUpdate(FiscalCondition entity) {
        return dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<FiscalCondition> filter(FiscalConditionFilter filterParam) {
        List<FilterParam> params = new ArrayList<>();
        String hql = "WHERE LOWER(c.nombre) LIKE LOWER('" + filterParam.getCondicionFiscalName() + "%')";
        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }
}

