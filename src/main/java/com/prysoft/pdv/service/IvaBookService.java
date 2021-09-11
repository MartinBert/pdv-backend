package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.IvaBookFilter;
import com.prysoft.pdv.models.Invoice;
import org.springframework.data.domain.Page;

public interface IvaBookService {
    Page<Invoice> filter(IvaBookFilter filterParams);
}
