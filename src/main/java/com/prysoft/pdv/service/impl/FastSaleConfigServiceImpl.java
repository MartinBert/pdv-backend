package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.FastSaleConfigDao;
import com.prysoft.pdv.dto.FastSaleConfigFilter;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.models.FastSaleConfig;
import com.prysoft.pdv.service.FastSaleConfigService;
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
public class FastSaleConfigServiceImpl extends FilterService<FastSaleConfig> implements FastSaleConfigService {
    @Autowired
    private FastSaleConfigDao dao;

    @Override
    public FastSaleConfig findById(Long id) {
        Optional<FastSaleConfig> optional = dao.findById(id);
        if (!optional.isPresent()) {
            throw new EntityNotFoundException();
        }
        return optional.get();
    }

    @Override
    public Page<FastSaleConfig> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public FastSaleConfig saveOrUpdate(FastSaleConfig entity) {
        return dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        try{
            Optional<FastSaleConfig> FastSaleConfig = dao.findById(id);
            if(FastSaleConfig.isPresent()){
                FastSaleConfig.get().setEstado(false);
                dao.save(FastSaleConfig.get());
            }
        }catch (Exception err){
            err.printStackTrace();
        }
    }

    @Override
    public Page<FastSaleConfig> filter(FastSaleConfigFilter filterParam) {
        String hql;
        List<FilterParam> params = new ArrayList<>();
        if(filterParam.getSucursalId() == null){
            hql = "";
        }else{
            hql =
                "JOIN c.clientePorDefecto cl " +
                "JOIN c.documentoPorDefecto d " +
                "JOIN c.sucursal s " +
                "WHERE s.id = ('"+filterParam.getSucursalId()+"')" +
                "AND LOWER(d.nombre) LIKE LOWER('%"+filterParam.getDocumentName()+"%') " +
                "AND LOWER(cl.nombre) LIKE LOWER('%"+filterParam.getClientName()+"%')";
        }
        return getPage(hql, filterParam.getPage() - 1, filterParam.getSize(), params);
    }

    @Override
    public FastSaleConfig filterBySucursalAndSeleccionado(Long sucursalId) {
        Optional<FastSaleConfig> optional = dao.findBySucursalIdAndSeleccionado(sucursalId, true);
        if(optional.isPresent()){
            return optional.get();
        }else{
            return null;
        }
    }

    @Override
    public Iterable<FastSaleConfig> saveOrUpdateAll(ArrayList<FastSaleConfig> entities) {
        return dao.saveAll(entities);
    }
}
