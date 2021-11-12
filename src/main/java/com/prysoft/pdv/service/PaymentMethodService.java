package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.PaymentMethodFilter;
import com.prysoft.pdv.models.PaymentMethod;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;

public interface PaymentMethodService {

    PaymentMethod findById(Long id);

    Page<PaymentMethod> findAll(Pageable page);

    PaymentMethod saveOrUpdate(PaymentMethod entity);

    Iterable<PaymentMethod> saveAll(ArrayList<PaymentMethod> entities);

    Page<PaymentMethod> filter(PaymentMethodFilter filterParam);

    Page<PaymentMethod> getCuentascorrientes(PaymentMethodFilter filterParam);

    void delete(Long id);

}