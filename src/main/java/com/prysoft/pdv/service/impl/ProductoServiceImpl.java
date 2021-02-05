package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.ProductoDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.GenericFilter;
import com.prysoft.pdv.models.Producto;
import com.prysoft.pdv.service.ProductoService;
import net.sf.jasperreports.engine.*;
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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

@Service
@Transactional
public class ProductoServiceImpl extends FilterService<Producto> implements ProductoService  {

    @Autowired
    private ProductoDao dao;

    @Override
    public Producto findById(Long id) {
        Optional<Producto> optional = dao.findById(id);
        if(optional.isEmpty()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
    public Producto findByCodigoBarra(String codigoBarra) {
        try{
            Optional<Producto> optional = dao.findByCodigoBarra(codigoBarra);
            return optional.get();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return null;
    }

    @Override
    public Page<Producto> findAll(Pageable page) {return dao.findAll(page);}

    @Override
    public Producto saveOrUpdate(Producto entity) {
        return dao.save(entity);
    }

    @Override
    public Iterable<Producto> saveOrUpdateAll(ArrayList<Producto> entities) {
        Iterable<Producto> productos = dao.findAll();
        productos.forEach((Producto el) -> {
            entities.forEach((Producto e) -> {
                if(el.getCodigoBarra().equals(e.getCodigoBarra())){
                    e.setId(el.getId());
                    System.out.println("Sel");
                }
            });
        });

        return dao.saveAll(entities);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<Producto> filter(GenericFilter filterParam) {
        List<FilterParam> params = new ArrayList<>();
        String hql;
        if(filterParam.getDoubleParam() > 0){
            hql = "WHERE (c.estado) != 1 AND (LOWER(c.nombre) LIKE LOWER('"+filterParam.getStringParam()+"%') OR LOWER(c.codigoBarra) LIKE LOWER('"+filterParam.getStringParam()+"%') OR LOWER(c.codigoProducto) LIKE LOWER('"+filterParam.getStringParam()+"%'))";
        }else{
            hql = "WHERE (c.estado) = 1 AND (LOWER(c.nombre) LIKE LOWER('"+filterParam.getStringParam()+"%') OR LOWER(c.codigoBarra) LIKE LOWER('"+filterParam.getStringParam()+"%') OR LOWER(c.codigoProducto) LIKE LOWER('"+filterParam.getStringParam()+"%'))";
        }

        return getPage(hql, filterParam.getPage(), filterParam.getSize(), params);
    }

    @Override
    public JasperPrint generalReport(String tenant, HttpServletResponse response) throws JRException, IOException, SQLException {

        Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/"+tenant,"postgres","12345");
        InputStream stream = this.getClass().getResourceAsStream("/reports/productsReports/AllProducts.jasper");
        JasperReport report = (JasperReport) JRLoader.loadObject(stream);
        JasperPrint print = JasperFillManager.fillReport(report,new HashMap<>(),conn);
        final ServletOutputStream output = response.getOutputStream();
        JasperExportManager.exportReportToPdfStream(print, output);

        return null;
    }
}
