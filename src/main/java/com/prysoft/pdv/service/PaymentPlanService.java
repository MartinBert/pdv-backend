package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.PaymentPlanFilter;
import com.prysoft.pdv.models.PaymentPlan;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;

public interface PaymentPlanService {

    PaymentPlan findById(Long id);

    Page<PaymentPlan> findAll(Pageable page);

    PaymentPlan saveOrUpdate(PaymentPlan entity);

    Iterable<PaymentPlan> saveAll(ArrayList<PaymentPlan> entities);

    Page<PaymentPlan> filter(PaymentPlanFilter filterParam);

    void delete(Long id);
}