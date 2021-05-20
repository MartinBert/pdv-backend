package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.PaymentPlan;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface PaymentPlanDao extends PagingAndSortingRepository<PaymentPlan, Long> {
}
