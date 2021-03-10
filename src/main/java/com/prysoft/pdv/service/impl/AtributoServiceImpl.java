package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.AtributoDao;
import com.prysoft.pdv.dto.AtributoFilter;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.models.Atributo;
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
public class AtributoServiceImpl extends FilterService<Atributo> implements AtributoService {

    @Autowired
    private AtributoDao dao;

    @Override
    public Atributo findById(Long id) {
        Optional<Atributo> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public Page<Atributo> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Atributo saveOrUpdate(Atributo entity) {
        if(entity.getValor() != null){
            Optional<Atributo> textAtributeInDatabase = dao.findByValor(entity.getValor());
            if(textAtributeInDatabase.isPresent()){
                return null;
            }else{
                return dao.save(entity);
            }
        }else if(entity.getValorNumerico() != 0){
            Optional<Atributo> numericAtributeInDatabase = dao.findByValorNumerico(entity.getValorNumerico());
            if(numericAtributeInDatabase.isPresent()){
                return null;
            }else{
                return dao.save(entity);
            }
        }else{
            return dao.save(entity);
        }
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<Atributo> filter(AtributoFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        hql = "WHERE LOWER(c.valor) LIKE LOWER('"+filterParam.getAtributoValor()+"%')";
        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }

    @Override
    public Iterable<Atributo> saveOrUpdateAll(ArrayList<Atributo> entities) {
        Iterable<Atributo> atributos = dao.findAll();
        atributos.forEach((Atributo el) -> {
            entities.forEach((Atributo e) -> {
                if(el.getValor().equals(e.getValor())){
                    e.setId(el.getId());
                }else if(el.getValorNumerico() == e.getValorNumerico()){
                    e.setId(el.getId());
                }
            });
        });
        return dao.saveAll(entities);
    }
}
