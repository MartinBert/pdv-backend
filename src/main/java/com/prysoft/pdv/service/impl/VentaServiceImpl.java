package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.VentaDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.VentaFilter;
import com.prysoft.pdv.models.ComprobanteFiscal;
import com.prysoft.pdv.models.Venta;
import com.prysoft.pdv.service.VentaService;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.util.JRLoader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityNotFoundException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;
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
        if(optional.isEmpty()) {
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
        List<FilterParam> params = new ArrayList<>();

        String hql = "WHERE LOWER(c.nombre) LIKE LOWER('"+filter.getNombre()+"%')";

        return getPage(hql, filter.getPage(), filter.getSize(), params);
    }

    @Override
    public JasperPrint closeSaleReport(ComprobanteFiscal request, String tenant, HttpServletResponse response) throws IOException, JRException, SQLException {

        InputStream stream = this.getClass().getResourceAsStream("/reports/factura_electronica.jasper");

        List<ComprobanteFiscal> data = new ArrayList<>();
        data.add(request);

        JRBeanCollectionDataSource datasource = new JRBeanCollectionDataSource(data);

        HashMap<String, Object> params = new HashMap<>();

        JasperReport report = (JasperReport) JRLoader.loadObject(stream);
        JasperPrint print = JasperFillManager.fillReport(report,params,datasource);
        final ServletOutputStream output = response.getOutputStream();
        JasperExportManager.exportReportToPdfStream(print, output);

        return null;
    }
}

