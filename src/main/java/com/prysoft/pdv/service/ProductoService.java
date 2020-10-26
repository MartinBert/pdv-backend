package com.prysoft.pdv.service;

import com.prysoft.pdv.dto.ProductoFilter;
import com.prysoft.pdv.models.Producto;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public interface ProductoService {
    Producto findById(Long id);

    Producto findByCodigoBarra(String codigoBarra);

    Page<Producto> findAll(Pageable page);

    Producto saveOrUpdate(Producto entity);

    Iterable<Producto> saveOrUpdateAll(ArrayList<Producto> entities);

    Page<Producto> filter(ProductoFilter filter);

    void delete(Long id);

    JasperPrint generalReport(String tenant, HttpServletResponse response) throws JRException, IOException, SQLException;

}
