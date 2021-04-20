package com.prysoft.pdv.helpers;

import com.prysoft.pdv.models.ComprobanteFiscal;
import com.prysoft.pdv.models.Producto;
import com.prysoft.pdv.models.ProductoDescription;
import com.prysoft.pdv.print.PrintSaleForSelectedProductAndDate;
import com.prysoft.pdv.print.PrintSaleProductQuantityDetail;
import com.prysoft.pdv.print.PrintSalesReport;
import com.prysoft.pdv.print.PrintWithProductDetails;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class PrintSalesHelper implements Serializable {
    @Autowired
    private MedioPagoHelper medioHelper;

    public PrintSalesReport processReceiptForPrint(ComprobanteFiscal receipt){
        PrintSalesReport report = new PrintSalesReport();
        String medios = medioHelper.stringPaymentMethodsNameConvertion(receipt.getMediosPago());
        report.setFechaEmision(receipt.getFechaEmision());
        if(receipt.getCliente() != null){
            report.setCliente(receipt.getCliente().getRazonSocial());
        }else{
            report.setCliente("");
        }
        report.setPuntoVenta(receipt.getPuntoVenta().getNombre());
        report.setNombreDocumento(receipt.getNombreDocumento());
        report.setTotalVenta(receipt.getTotalVenta());
        report.setMedioPago(medios);
        report.setProductos(receipt.getProductoDescription());
        return report;
    }

    public PrintWithProductDetails processReceiptForPrintWithProductDetails(ComprobanteFiscal receipt){
        PrintWithProductDetails report = new PrintWithProductDetails();
        String medios = medioHelper.stringPaymentMethodsNameConvertion(receipt.getMediosPago());
        JRBeanCollectionDataSource products = new JRBeanCollectionDataSource(receipt.getProductoDescription());
        report.setFechaEmision(receipt.getFechaEmision());
        if(receipt.getCliente() != null){
            report.setCliente(receipt.getCliente().getRazonSocial());
        }else{
            report.setCliente("");
        }
        report.setPuntoVenta(receipt.getPuntoVenta().getNombre());
        report.setNombreDocumento(receipt.getNombreDocumento());
        report.setTotalVenta(receipt.getTotalVenta());
        report.setMedioPago(medios);
        report.setProductos(products);
        return report;
    }

    public PrintSaleProductQuantityDetail processPrintSaleProductQuantityDetail(ProductoDescription product, PrintSaleForSelectedProductAndDate request){
        PrintSaleProductQuantityDetail productQuantityDetail = new PrintSaleProductQuantityDetail();
        for(Producto productoDescription: request.getProducts()){
            if(product.getBarCode().equals(productoDescription.getCodigoBarra())){
                productQuantityDetail.setQuantity(product.getQuantity());
                productQuantityDetail.setAmount(product.getSalePrice());
                productQuantityDetail.setInitDate(request.getFechaDesde());
                productQuantityDetail.setFinishDate(request.getFechaHasta());
                productQuantityDetail.setProduct(product.getName() + " " + product.getBarCode() + " " + product.getCode());
            }
        }
        if(productQuantityDetail.getProduct() != null){
            return productQuantityDetail;
        }else{
            return null;
        }
    }
}
