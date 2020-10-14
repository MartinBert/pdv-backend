package com.prysoft.pdv.service.impl;

import com.prysoft.pdv.dao.VentaDao;
import com.prysoft.pdv.dto.FilterParam;
import com.prysoft.pdv.dto.VentaFilter;
import com.prysoft.pdv.models.ComprobanteFiscal;
import com.prysoft.pdv.models.PrintComprobante;
import com.prysoft.pdv.models.Producto;
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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

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
    public JasperPrint closeSaleReport(ComprobanteFiscal request, String tenant, HttpServletResponse response) throws IOException, JRException, ParseException {

        String route = System.getProperty("user.dir")+"\\src\\main\\resources\\reports\\factura_detail.jasper";

        InputStream stream = this.getClass().getResourceAsStream("/reports/factura_electronica.jasper");

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        String fechaInicioAct = format.format(request.getSucursal().getFechaInicioAct());

        PrintComprobante comprobante = new PrintComprobante();
        comprobante.setBarCode(request.getBarCode());
        comprobante.setCae(request.getCae());
        comprobante.setFechaEmision(request.getFechaEmision());
        comprobante.setFechaVto(request.getFechaVto());
        comprobante.setLetra(request.getLetra());
        comprobante.setClienteCondicionIva(request.getCliente().getCondicionIva().getNombre());
        comprobante.setClienteCuit(request.getCliente().getCuit());
        comprobante.setClienteDireccion(request.getCliente().getDireccion());
        comprobante.setClienteRazonSocial(request.getCliente().getRazonSocial());
        comprobante.setCondicionVenta(request.getCondicionVenta());
        comprobante.setNumeroCbte(request.getNumeroCbte());
        comprobante.setIdPuntoVenta(request.getPuntoVenta().getIdFiscal());
        comprobante.setEmpresaCondicionIva(request.getSucursal().getCondicionIva().getNombre());
        comprobante.setEmpresaCuit(request.getSucursal().getCuit());
        comprobante.setEmpresaDireccion(request.getSucursal().getDireccion());
        comprobante.setEmpresaFechaInicioAct(fechaInicioAct);
        comprobante.setEmpresaRazonSocial(request.getSucursal().getRazonSocial());
        comprobante.setEmpresaTelefono(request.getSucursal().getTelefono());
        comprobante.setEmpresaIngBruto(request.getSucursal().getIngBruto());
        comprobante.setProductos(request.getProductos());

        List<PrintComprobante> data = new ArrayList<>();
        data.add(comprobante);

        List<Producto> dataDetail = comprobante.getProductos();
        System.out.println(dataDetail);

        JRBeanCollectionDataSource datasource = new JRBeanCollectionDataSource(data);

        HashMap<String, Object> params = new HashMap<>();
        params.put("SUBREPORT_DIR", route);
        params.put("SUBREPORT_DATA", dataDetail.get(0).getNombre());

        JasperReport report = (JasperReport) JRLoader.loadObject(stream);
        JasperPrint print = JasperFillManager.fillReport(report,params,datasource);
        final ServletOutputStream output = response.getOutputStream();
        JasperExportManager.exportReportToPdfStream(print, output);

        return null;
    }
}

