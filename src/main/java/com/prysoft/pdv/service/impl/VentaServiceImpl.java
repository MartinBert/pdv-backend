package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.VentaDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.VentaFilter;
import com.prysoft.pdv.models.ComprobanteFiscal;
import com.prysoft.pdv.models.Venta;
import com.prysoft.pdv.service.VentaService;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class VentaServiceImpl extends FilterService<Venta> implements VentaService {

    private List<Integer> lista;

    @Autowired
    private VentaDao dao;

    @Override
    public Venta findById(Long id) {
        Optional<Venta> optional = dao.findById(id);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
    public Page<Venta> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Venta saveOrUpdate(Venta entity) {
        return dao.save(entity);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<Venta> filter(VentaFilter filter) {
        StringBuilder hql = new StringBuilder();
        List<FilterParam> params = new ArrayList<>();

        hql
                .append("WHERE LOWER(c.nombre) LIKE LOWER('")
                .append(filter.getNombre())
                .append("%')");

        return getPage(hql.toString(), filter.getPage(), filter.getSize(), params);
    }

    @Override
    public JasperPrint closeSaleReport(ComprobanteFiscal request) throws IOException, JRException {
        Path currentRelativePath = Paths.get("","reports","FacturaElectronica.jasper");
        String path = currentRelativePath.toRealPath().toString();

        String letra = request.getLetra();
        String barCode = request.getBarCode();
        String fechaEmision = request.getFechaEmision();
        String fechaVto = request.getFechaVto();
        String cae = request.getCae();

        HashMap<String, Object> parameters = new HashMap<>();
        parameters.put("letra", letra);
        parameters.put("barCode", barCode);
        parameters.put("fechaEmision", fechaEmision);
        parameters.put("fechaVto", fechaVto);
        parameters.put("cae", cae);

        JasperPrint reporte = JasperFillManager.fillReport(path, parameters);
        return null;
    }
}

