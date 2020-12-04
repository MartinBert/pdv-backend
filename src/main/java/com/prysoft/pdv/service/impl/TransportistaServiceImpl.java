package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.TransportistaDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.Transportista;
import com.prysoft.pdv.service.TransportistaService;
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
public class TransportistaServiceImpl extends FilterService<Transportista> implements TransportistaService {

    @Autowired
    private TransportistaDao dao;

    @Override
    public Transportista findById(Long id) {
        Optional<Transportista> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
    public Page<Transportista> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Transportista saveOrUpdate(Transportista entity) {
        return dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<Transportista> filter(GenericFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();

        if(filterParam.getId() == null){
            hql =
                    "WHERE (LOWER(c.razonSocial) LIKE LOWER('"+filterParam.getParam()+"%') " +
                            "OR LOWER(c.nombre) LIKE LOWER('"+filterParam.getParam()+"%') " +
                            "OR LOWER(c.direccion) LIKE LOWER('"+filterParam.getParam()+"%') " +
                            "OR LOWER(c.nombreContacto) LIKE LOWER('"+filterParam.getParam()+"%') " +
                            "OR LOWER(c.cuit) LIKE LOWER('"+filterParam.getParam()+"%'))";
        }else{
            hql =
                    "JOIN c.sucursales WHERE (id_sucursal) = ('"+filterParam.getId()+"') " +
                            "AND (LOWER(c.razonSocial) LIKE LOWER('"+filterParam.getParam()+"%') " +
                            "OR LOWER(c.nombre) LIKE LOWER('"+filterParam.getParam()+"%') " +
                            "OR LOWER(c.direccion) LIKE LOWER('"+filterParam.getParam()+"%') " +
                            "OR LOWER(c.nombreContacto) LIKE LOWER('"+filterParam.getParam()+"%') " +
                            "OR LOWER(c.cuit) LIKE LOWER('"+filterParam.getParam()+"%'))";
        }

        return getPage(hql, filterParam.getPage(), filterParam.getSize(), params);
    }
}
