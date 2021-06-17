package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.PaymentMethodDetail;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentMethodDetailDao extends PagingAndSortingRepository<PaymentMethodDetail, Long> {
}