package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.AttributeDao;
import com.prysoft.pdv.dto.AttributeFilter;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.models.Attribute;
import com.prysoft.pdv.models.Brand;
import com.prysoft.pdv.service.AtributoService;
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
public class AtributoServiceImpl extends FilterService<Attribute> implements AtributoService {
    @Autowired
    private AttributeDao dao;

    @Override
    public Attribute findById(Long id) {
        Optional<Attribute> optional = dao.findById(id);
        if (!optional.isPresent()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public Page<Attribute> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Attribute saveOrUpdate(Attribute entity) {
        if (entity.getValor() != null) {
            Optional<Attribute> textAtributeInDatabase = dao.findByValor(entity.getValor());
            if (textAtributeInDatabase.isPresent()) {
                return null;
            } else {
                return dao.save(entity);
            }
        } else if (entity.getValorNumerico() != 0) {
            Optional<Attribute> numericAtributeInDatabase = dao.findByValorNumerico(entity.getValorNumerico());
            if (numericAtributeInDatabase.isPresent()) {
                return null;
            } else {
                return dao.save(entity);
            }
        } else {
            return dao.save(entity);
        }
    }

    @Override
    public void delete(Long id) {
        try{
            Optional<Attribute> attribute = dao.findById(id);
            if(attribute.isPresent()){
                attribute.get().setEstado(false);
                dao.save(attribute.get());
            }
        }catch (Exception err){
            err.printStackTrace();
        }
    }

    @Override
    public Page<Attribute> filter(AttributeFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        hql = "WHERE LOWER(c.valor) LIKE LOWER('" + filterParam.getAtributoValor() + "%')"+
              "AND c.estado IS TRUE";
        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }

    @Override
    public Iterable<Attribute> saveOrUpdateAll(ArrayList<Attribute> entities) {
        Iterable<Attribute> atributos = dao.findAll();
        atributos.forEach((Attribute el) -> {
            entities.forEach((Attribute e) -> {
                if (el.getValor().equals(e.getValor())) {
                    e.setId(el.getId());
                } else if (el.getValorNumerico() == e.getValorNumerico()) {
                    e.setId(el.getId());
                }
            });
        });
        return dao.saveAll(entities);
    }
}
