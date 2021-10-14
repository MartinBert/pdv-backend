package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.PaymentMethodDao;
import com.prysoft.pdv.dao.PaymentMethodDetailDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.PaymentMethodFilter;
import com.prysoft.pdv.models.PaymentMethod;
import com.prysoft.pdv.models.PaymentMethodDetail;
import com.prysoft.pdv.models.Property;
import com.prysoft.pdv.service.PaymentMethodService;
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
public class PaymentMethodServiceImpl extends FilterService<PaymentMethod> implements PaymentMethodService {
    @Autowired
    private PaymentMethodDao dao;
    @Autowired
    private PaymentMethodDetailDao paymentMethodDetailDao;

    @Override
    public PaymentMethod findById(Long id) {
        Optional<PaymentMethod> optional = dao.findById(id);
        if (!optional.isPresent()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public Page<PaymentMethod> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public PaymentMethod saveOrUpdate(PaymentMethod entity) {
        return dao.save(entity);
    }

    @Override
    public Iterable<PaymentMethod> saveAll(ArrayList<PaymentMethod> entities) {
        return dao.saveAll(entities);
    }

    @Override
    public void delete(Long id) {
        try{
            Optional<PaymentMethod> paymentMethod = dao.findById(id);
            if(paymentMethod.isPresent()){
                paymentMethod.get().setEstado(false);
                dao.save(paymentMethod.get());
            }
        }catch (Exception err){
            err.printStackTrace();
        }
    }

    @Override
    public Page<PaymentMethod> filter(PaymentMethodFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        if (filterParam.getSucursalId() == null) {
            hql = "WHERE LOWER(c.nombre) LIKE LOWER('" + filterParam.getMedioPagoName() + "%') GROUP BY c.id ORDER BY c.id ASC";
        } else {
            hql = "WHERE (c.sucursal.id) = ('" + filterParam.getSucursalId() + "') " +
                            "AND LOWER(c.nombre) LIKE LOWER('" + filterParam.getMedioPagoName() + "%') GROUP BY c.id ORDER BY c.id ASC" +
                            "AND c.estado IS TRUE";
        }
        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }
}

