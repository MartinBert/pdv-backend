package com.prysoft.pdv.service;


import com.prysoft.pdv.dto.NoteFilter;
import com.prysoft.pdv.models.Note;
import com.prysoft.pdv.models.Print;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface PrintService {
    Note findById(Long id);

    Page<Print> findAll(Pageable page);

    Note saveOrUpdate(Print entity);

    void delete(Long id);

    Page<Print> filter(NoteFilter filterParam);
}
