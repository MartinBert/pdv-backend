package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.PaymentMethodDetailDao;
import com.prysoft.pdv.models.PaymentMethodDetail;
import com.prysoft.pdv.service.PaymentMethodDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
@Service
@Transactional
public class PaymentMethodDetailServiceImpl extends FilterService<PaymentMethodDetail> implements PaymentMethodDetailService {
    @Autowired
    private PaymentMethodDetailDao dao;

    @Override
    public PaymentMethodDetail saveOrUpdate(PaymentMethodDetail entity) {
        return dao.save(entity);
    }
}

