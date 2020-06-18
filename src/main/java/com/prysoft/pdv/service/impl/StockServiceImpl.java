package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.StockDao;
import com.prysoft.pdv.models.Producto;
import com.prysoft.pdv.models.Stock;
import com.prysoft.pdv.service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.Optional;

@Service
@Transactional
public class StockServiceImpl implements StockService {
    @Autowired
    private StockDao dao;

    @Override
    public Stock findById(Long id) {
        Optional<Stock> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
    public Page<Stock> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Stock saveOrUpdate(Stock entity) {
        return dao.save(entity);
    }

    @Override
    public Iterable<Stock> saveAll(ArrayList<Stock> entities) {
        return dao.saveAll(entities);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }
}
