package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.CajaDao;
import com.prysoft.pdv.dao.NoteDao;
import com.prysoft.pdv.dto.CajaFilter;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.NoteFilter;
import com.prysoft.pdv.models.Caja;
import com.prysoft.pdv.models.Note;
import com.prysoft.pdv.service.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class NoteServiceImpl extends FilterService<Note> implements NoteService {
    @Autowired
    private NoteDao dao;

    @Override
    public Note findById(Long id) {
        Optional<Note> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public Page<Note> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Note saveOrUpdate(Note entity) {
        return dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<Note> filter(NoteFilter filterParam) {
        String hql= "";
        List<FilterParam> params = new ArrayList<>();

        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }
}

