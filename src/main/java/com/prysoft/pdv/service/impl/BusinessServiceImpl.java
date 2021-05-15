package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.BusinessDao;
import com.prysoft.pdv.dao.FiscalConditionDao;
import com.prysoft.pdv.dto.BusinessFilter;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.models.Business;
import com.prysoft.pdv.service.BusinessService;
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
public class BusinessServiceImpl extends FilterService<Business> implements BusinessService {

    @Autowired
    private BusinessDao dao;

    @Autowired
    private FiscalConditionDao daoc;

    @Override
    public Business findById(Long id) {
        Optional<Business> optional = dao.findById(id);
        if (!optional.isPresent()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public Page<Business> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Business saveOrUpdate(Business entity) {
        return dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<Business> filter(BusinessFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        if (filterParam.getPerfilId() == 1) {
            hql =
                    "WHERE LOWER(c.razonSocial) LIKE LOWER('" + filterParam.getEmpresaSocialReason() + "%') " +
                            "AND LOWER(c.cuit) LIKE LOWER('" + filterParam.getEmpresaCuit() + "%') " +
                            "AND LOWER(c.alias) LIKE LOWER('" + filterParam.getEmpresaName() + "%')";
        } else {
            hql =
                    "WHERE (c.id) = ('" + filterParam.getEmpresaId() + "') " +
                            "AND LOWER(c.razonSocial) LIKE LOWER('" + filterParam.getEmpresaSocialReason() + "%') " +
                            "AND LOWER(c.cuit) LIKE LOWER('" + filterParam.getEmpresaCuit() + "%') " +
                            "AND LOWER(c.alias) LIKE LOWER('" + filterParam.getEmpresaName() + "%')";
        }
        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }
}

