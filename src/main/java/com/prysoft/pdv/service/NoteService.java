package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.NoteFilter;
import com.prysoft.pdv.models.Note;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


public interface NoteService {

    Note findById(Long id);

    Page<Note> findAll(Pageable page);

    Note saveOrUpdate(Note entity);

    void delete(Long id);

    Page<Note> filter(NoteFilter filterParam);

}
