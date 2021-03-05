package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.VendedorDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.Vendedor;
import com.prysoft.pdv.service.VendedorService;
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
public class VendedorServiceImpl extends FilterService<Vendedor> implements VendedorService {

    @Autowired
    private VendedorDao dao;

    @Override
    public Vendedor findById(Long id) {
        Optional<Vendedor> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
    public Page<Vendedor> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Vendedor saveOrUpdate(Vendedor entity) {
        return dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<Vendedor> filter(GenericFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();

        if(filterParam.getThirdLongParam() == null){
            hql =
                    "WHERE (LOWER(c.razonSocial) LIKE LOWER('"+filterParam.getStringParam()+"%') " +
                            "OR LOWER(c.nombre) LIKE LOWER('"+filterParam.getStringParam()+"%') " +
                            "OR LOWER(c.direccion) LIKE LOWER('"+filterParam.getStringParam()+"%') " +
                            "OR LOWER(c.nombreContacto) LIKE LOWER('"+filterParam.getStringParam()+"%') " +
                            "OR LOWER(c.cuit) LIKE LOWER('"+filterParam.getStringParam()+"%'))";
        }else{
            hql =
                    "JOIN c.sucursales WHERE (id_sucursal) = ('"+filterParam.getThirdLongParam()+"') " +
                            "AND (LOWER(c.razonSocial) LIKE LOWER('"+filterParam.getStringParam()+"%') " +
                            "OR LOWER(c.nombre) LIKE LOWER('"+filterParam.getStringParam()+"%') " +
                            "OR LOWER(c.direccion) LIKE LOWER('"+filterParam.getStringParam()+"%') " +
                            "OR LOWER(c.nombreContacto) LIKE LOWER('"+filterParam.getStringParam()+"%') " +
                            "OR LOWER(c.cuit) LIKE LOWER('"+filterParam.getStringParam()+"%'))";
        }

        return getPage(hql, filterParam.getPage(), filterParam.getSize(), params);
    }
}
