package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.ProductoDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.ProductoFilter;
import com.prysoft.pdv.models.Producto;
import com.prysoft.pdv.service.ProductoService;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;

import javax.persistence.EntityNotFoundException;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
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
        if(!optional.isPresent()) {
            throw new EntityNotFoundException();
        }

        return optional.get();
    }

    @Override
    public Producto findByCodigoBarra(String codigoBarra) {
        Optional<Producto> optional = dao.findByCodigoBarra(codigoBarra);
        if(!optional.isPresent()) {
            throw new EntityNotFoundException("No existe producto con ese código de barras");
        }

        return optional.get();
    }

    @Override
    public Page<Producto> findAll(Pageable page) {
        return dao.findAll(page);
    }

    @Override
    public Producto saveOrUpdate(Producto entity) {
        return dao.save(entity);
    }

    @Override
    public Iterable<Producto> saveAll(ArrayList<Producto> entities) {
        return dao.saveAll(entities);
    }

    @Override
    public void delete(Long id) {
        dao.deleteById(id);
    }

    @Override
    public Page<Producto> filter(ProductoFilter filter) {
        StringBuilder hql = new StringBuilder();
        List<FilterParam> params = new ArrayList<>();

        hql
                .append("WHERE LOWER(c.nombre) LIKE LOWER('")
                .append(filter.getNombre())
                .append("%')");

        if(filter.getCodigoBarra() != null && filter.getCodigoBarra().trim().length() > 0) {
            hql
                    .append(" OR LOWER(c.codigoBarra) LIKE LOWER('")
                    .append(filter.getCodigoBarra())
                    .append("%')");
        }

        if(filter.getCodigoProducto() != null && filter.getCodigoProducto().trim().length() > 0) {
            hql
                    .append(" OR LOWER(c.codigoProducto) LIKE LOWER('")
                    .append(filter.getCodigoProducto())
                    .append("%')");
        }

        return getPage(hql.toString(), filter.getPage(), filter.getSize(), params);
    }

    @Override
    public JasperPrint generalReport(String tenant) throws JRException, IOException, SQLException {
        Connection conn = DriverManager.getConnection(new String("jdbc:postgresql://localhost:5432/"+tenant),new String("postgres"),new String("12345"));
        Path currentRelativePath = Paths.get("","reports","AllProducts.jasper");
        String path = currentRelativePath.toRealPath().toString();

        JasperPrint reporte = JasperFillManager.fillReport(path,new HashMap<>(),conn);
        return reporte;
    }
}
