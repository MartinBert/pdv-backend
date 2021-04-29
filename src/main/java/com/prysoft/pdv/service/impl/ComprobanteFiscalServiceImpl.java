package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.ComprobanteFiscalDao;
import com.prysoft.pdv.dto.ComprobanteFiscalFilter;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.models.ComprobanteFiscal;
import com.prysoft.pdv.service.ComprobanteFiscalService;
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
public class ComprobanteFiscalServiceImpl extends FilterService<ComprobanteFiscal> implements ComprobanteFiscalService {

    @Autowired
    private ComprobanteFiscalDao dao;

    @Override
    public ComprobanteFiscal findById(Long id) {
        Optional<ComprobanteFiscal> optional = dao.findById(id);
        if(optional.isEmpty()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public ComprobanteFiscal findByNumeroCbte(String numero) {
        Optional<ComprobanteFiscal> optional = dao.findByNumeroCbte(numero);
        if(optional.isEmpty()){
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public Page<ComprobanteFiscal> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public ComprobanteFiscal saveOrUpdate(ComprobanteFiscal entity) {
        System.out.println(entity);
        return dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Iterable<ComprobanteFiscal> saveOrUpdateAll(ArrayList<ComprobanteFiscal> entities) {
        return dao.saveAll(entities);
    }

    @Override
    public Page<ComprobanteFiscal> filter(ComprobanteFiscalFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        if(filterParam.getSucursalId() == null){
            hql =
                "WHERE LOWER(c.letra) LIKE LOWER('"+filterParam.getComprobanteFiscalLetra()+"') " +
                "AND LOWER(c.fechaEmision) LIKE LOWER('"+filterParam.getComprobanteFiscalFechaEmision()+"%') " +
                "AND LOWER(c.numeroCbte) LIKE LOWER('"+filterParam.getComprobanteFiscalNumeroCbte()+"%') " +
                "AND LOWER(c.nombreDocumento) LIKE LOWER('"+filterParam.getComprobanteFiscalNombreDocumento()+"%') ";
        }else{
            hql =
                "WHERE (c.sucursal.id) = ('"+filterParam.getSucursalId()+"') " +
                "AND LOWER(c.letra) LIKE LOWER('"+filterParam.getComprobanteFiscalLetra()+"') " +
                "AND LOWER(c.fechaEmision) LIKE LOWER('"+filterParam.getComprobanteFiscalFechaEmision()+"%') " +
                "AND LOWER(c.numeroCbte) LIKE LOWER('"+filterParam.getComprobanteFiscalNumeroCbte()+"%') " +
                "AND LOWER(c.nombreDocumento) LIKE LOWER('"+filterParam.getComprobanteFiscalNombreDocumento()+"%') ";
        }
        return getPage(hql , filterParam.getPage(), filterParam.getSize(), params);
    }
}

