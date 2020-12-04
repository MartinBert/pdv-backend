package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.DocumentoComercialDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.DocumentoComercial;
import com.prysoft.pdv.service.DocumentoComercialService;
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
public class DocumentoComercialServiceImpl extends FilterService<DocumentoComercial> implements DocumentoComercialService {

    @Autowired
    private DocumentoComercialDao dao;

    @Override
    public DocumentoComercial findById(Long id) {
        Optional<DocumentoComercial> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
    public Page<DocumentoComercial> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public DocumentoComercial saveOrUpdate(DocumentoComercial entity) {
        return dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Iterable<DocumentoComercial> getInvoices() {
        String[] invoicesCodeArray = new String[]{"001", "006", "011", "081", "082", "111", "9999"};
        Iterable<DocumentoComercial> allDocuments = dao.findAll();
        ArrayList<DocumentoComercial> documentList = new ArrayList<>();

        for(DocumentoComercial el: allDocuments){
            for(String e: invoicesCodeArray){
                if(el.getCodigoDocumento().equals(e)){
                    documentList.add(el);
                }
            }
        }
        return documentList;
    }

    @Override
    public Page<DocumentoComercial> filter(GenericFilter filterParam) {
        List<FilterParam> params = new ArrayList<>();

        String hql = "WHERE LOWER(c.nombre) LIKE LOWER('"+filterParam.getParam()+"%')";

        return getPage(hql, filterParam.getPage(), filterParam.getSize(), params);
    }

    @Override
    public Iterable<DocumentoComercial> saveAll(ArrayList<DocumentoComercial> entities) {
        return dao.saveAll(entities);
    }
}


