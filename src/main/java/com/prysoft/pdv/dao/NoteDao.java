package com.prysoft.pdv.dao;

import com.prysoft.pdv.models.Note;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteDao extends PagingAndSortingRepository<Note, Long> {


}
