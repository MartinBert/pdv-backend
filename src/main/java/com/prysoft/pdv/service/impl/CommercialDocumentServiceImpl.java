package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.CommercialDocumentDao;
import com.prysoft.pdv.dto.CommercialDocumentFilter;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.models.CommercialDocument;
import com.prysoft.pdv.service.CommercialDocumentService;
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
public class CommercialDocumentServiceImpl extends FilterService<CommercialDocument> implements CommercialDocumentService {
    @Autowired
    private CommercialDocumentDao dao;

    @Override
    public CommercialDocument findById(Long id) {
        Optional<CommercialDocument> optional = dao.findById(id);
        if (!optional.isPresent()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public Page<CommercialDocument> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public CommercialDocument saveOrUpdate(CommercialDocument entity) {
        return dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Iterable<CommercialDocument> getInvoices() {
        String[] invoicesCodeArray = new String[]{"001", "006", "011", "081", "082", "111", "9999"};
        Iterable<CommercialDocument> allDocuments = dao.findAll();
        ArrayList<CommercialDocument> documentList = new ArrayList<>();
        for (CommercialDocument el : allDocuments) {
            for (String e : invoicesCodeArray) {
                if (el.getCodigoDocumento().equals(e)) {
                    documentList.add(el);
                }
            }
        }
        return documentList;
    }

    @Override
    public Page<CommercialDocument> filter(CommercialDocumentFilter filterParam) {
        List<FilterParam> params = new ArrayList<>();
        String hql = "WHERE LOWER(c.nombre) LIKE LOWER('" + filterParam.getDocumentoComercialName() + "%')";
        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }

    @Override
    public Iterable<CommercialDocument> saveAll(ArrayList<CommercialDocument> entities) {
        return dao.saveAll(entities);
    }
}


