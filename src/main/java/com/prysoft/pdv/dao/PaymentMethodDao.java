package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.PaymentMethod;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentMethodDao extends PagingAndSortingRepository<PaymentMethod, Long> {
}
