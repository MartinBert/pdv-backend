package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.BrandDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.MarcaFilter;
import com.prysoft.pdv.models.Brand;
import com.prysoft.pdv.service.BrandService;
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
public class BrandServiceImpl extends FilterService<Brand> implements BrandService {
    @Autowired
    private BrandDao dao;

    @Override
    public Brand findById(Long id) {
        Optional<Brand> optional = dao.findById(id);
        if (!optional.isPresent()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public Page<Brand> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Brand saveOrUpdate(Brand entity) {
        return dao.save(entity);
    }

    @Override
    public Iterable<Brand> saveAll(ArrayList<Brand> entities) {
        return dao.saveAll(entities);
    }

    @Override
    public void delete(Long id) {
       // try{
           // Optional<Brand> brand = dao.findById(id);
            //if(brand.isPresent()){
               // brand.get().setEstado(false);
                //dao.save(brand.get());
           // }
        //}catch (Exception err){
            //err.printStackTrace();
        //}
    }

    @Override
    public Page<Brand> filter(MarcaFilter filterParam) {
        List<FilterParam> params = new ArrayList<>();
        String hql =
                "WHERE LOWER(c.nombre) LIKE LOWER ('" + filterParam.getMarcaName() + "%') ";
        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }
}
