package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.ClienteDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.models.Cliente;
import com.prysoft.pdv.service.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ClienteServiceImpl extends FilterService<Cliente> implements ClienteService {

    @Autowired
    private ClienteDao dao;

    @Override
    public Cliente findById(Long id) {
        Optional<Cliente> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
    public Page<Cliente> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Cliente saveOrUpdate(Cliente entity) {return dao.save(entity);}

    @Override
    public Page<Cliente> filter(Long filter, int page, int size) {
        List<FilterParam> params = new ArrayList<>();
        String hql = "JOIN c.sucursales WHERE (id_sucursal) = ('"+filter+"')";
        return getPage(hql,page,size,params);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }
}
