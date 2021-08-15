package com.prysoft.pdv.service;

import com.prysoft.pdv.models.PaymentMethodDetail;

public interface PaymentMethodDetailService {
    PaymentMethodDetail saveOrUpdate(PaymentMethodDetail entity);
}