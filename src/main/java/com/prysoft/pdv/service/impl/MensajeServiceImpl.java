package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.MensajeDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.MensajeFilter;
import com.prysoft.pdv.models.Message;
import com.prysoft.pdv.service.MensajeService;
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
public class MensajeServiceImpl extends FilterService<Message> implements MensajeService {
    @Autowired
    private MensajeDao dao;

    @Override
    public Message findById(Long id) {
        Optional<Message> optional = dao.findById(id);
        if (!optional.isPresent()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
    public Page<Message> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Message saveOrUpdate(Message entity) {
        return dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<Message> filter(MensajeFilter filterParam) {
        List<FilterParam> params = new ArrayList<>();
        String hql =
                "WHERE LOWER(c.nameAndLastName) LIKE LOWER('" + filterParam.getMensajeNameAndLastName() + "%') " +
                        "AND LOWER(c.date) LIKE LOWER('" + filterParam.getMensajeDate() + "%') " +
                        "AND LOWER(c.contactPhoneOrEmail) LIKE LOWER('" + filterParam.getMensajeContactPhoneOrEmail() + "%') " +
                        "AND LOWER(c.message) LIKE LOWER('" + filterParam.getMensajeMessage() + "%') ";
        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }
}
