package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.ClientDao;
import com.prysoft.pdv.dto.ClientFilter;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.models.Client;
import com.prysoft.pdv.service.ClientService;
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
public class ClientServiceImpl extends FilterService<Client> implements ClientService {

    @Autowired
    private ClientDao dao;

    @Override
    public Client findById(Long id) {
        Optional<Client> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
    public Page<Client> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Client saveOrUpdate(Client entity) {return dao.save(entity);}

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<Client> filter(ClientFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();

        if(filterParam.getSucursalId() == null){
            hql =
                "WHERE (LOWER(c.razonSocial) LIKE LOWER('"+filterParam.getPersonaSocialReason()+"%') " +
                "AND LOWER(c.nombre) LIKE LOWER('"+filterParam.getPersonaName()+"%') " +
                "AND LOWER(c.direccion) LIKE LOWER('"+filterParam.getPersonaDirection()+"%') " +
                "AND LOWER(c.nombreContacto) LIKE LOWER('"+filterParam.getPersonaContactName()+"%') " +
                "AND LOWER(c.cuit) LIKE LOWER('"+filterParam.getPersonaCuit()+"%'))";
        }else{
            hql =
                "JOIN c.sucursales s WHERE s.id = ('"+filterParam.getSucursalId()+"') " +
                "AND (LOWER(c.razonSocial) LIKE LOWER('"+filterParam.getPersonaSocialReason()+"%') " +
                "AND LOWER(c.nombre) LIKE LOWER('"+filterParam.getPersonaName()+"%') " +
                "AND LOWER(c.direccion) LIKE LOWER('"+filterParam.getPersonaDirection()+"%') " +
                "AND LOWER(c.nombreContacto) LIKE LOWER('"+filterParam.getPersonaContactName()+"%') " +
                "AND LOWER(c.cuit) LIKE LOWER('"+filterParam.getPersonaCuit()+"%'))";
        }

        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }

}
