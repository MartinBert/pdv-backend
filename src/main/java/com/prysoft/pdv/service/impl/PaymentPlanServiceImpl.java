package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.PaymentPlanDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.PaymentPlanFilter;
import com.prysoft.pdv.models.PaymentPlan;
import com.prysoft.pdv.service.PaymentPlanService;
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
public class PaymentPlanServiceImpl extends FilterService<PaymentPlan> implements PaymentPlanService {
    @Autowired
    private PaymentPlanDao dao;

    @Override
    public PaymentPlan findById(Long id) {
        Optional<PaymentPlan> optional = dao.findById(id);
        if (!optional.isPresent()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public Page<PaymentPlan> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public PaymentPlan saveOrUpdate(PaymentPlan entity) {
        return dao.save(entity);
    }

    @Override
    public Iterable<PaymentPlan> saveAll(ArrayList<PaymentPlan> entities) {
        return dao.saveAll(entities);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<PaymentPlan> filter(PaymentPlanFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        if (filterParam.getSucursalId() == null) {
            hql = "WHERE LOWER(c.nombre) LIKE LOWER('" + filterParam.getPlanPagoName() + "%')";
        } else {
            hql = "WHERE (c.sucursal.id) = ('" + filterParam.getSucursalId() + "') " +
                    "AND LOWER(c.nombre) LIKE LOWER('" + filterParam.getPlanPagoName() + "%')";
        }
        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }
}
