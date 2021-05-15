package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.MensajeFilter;
import com.prysoft.pdv.models.Message;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MensajeService {
    Message findById(Long id);

    Page<Message> findAll(Pageable page);

    Message saveOrUpdate(Message entity);

    void delete(Long id);

    Page<Message> filter(MensajeFilter filterParam);
}
