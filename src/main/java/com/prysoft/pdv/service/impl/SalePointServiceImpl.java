package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.SalePointDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.SalePointFilter;
import com.prysoft.pdv.models.SalePoint;
import com.prysoft.pdv.service.SalePointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class SalePointServiceImpl extends FilterService<SalePoint> implements SalePointService {

    @PersistenceContext
    EntityManager entityManager;

    @Autowired
    private SalePointDao dao;

    @Override
    public SalePoint findById(Long id) {
        Optional<SalePoint> optional = dao.findById(id);
        if (!optional.isPresent()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public Page<SalePoint> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public SalePoint saveOrUpdate(SalePoint entity) {
        return dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<SalePoint> filter(SalePointFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        if (filterParam.getSucursalId() == null) {
            hql = "WHERE LOWER(c.nombre) LIKE LOWER('" + filterParam.getPuntoVentaName() + "%')";
        } else {
            hql = "WHERE (c.sucursal.id) = ('" + filterParam.getSucursalId() + "') " +
                    "AND LOWER(c.nombre) LIKE LOWER('" + filterParam.getPuntoVentaName() + "%')";
        }
        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }
}

