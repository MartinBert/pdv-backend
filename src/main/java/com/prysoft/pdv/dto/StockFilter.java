package com.prysoft.pdv.dto;

public class StockFilter extends ProductFilter {
    private Long stockId;
    private Long stockDepositoId;
    private String stockDepositoName;

    public Long getStockId() {
        return stockId;
    }

    public void setStockId(Long stockId) {
        this.stockId = stockId;
    }

    public Long getStockDepositoId() {
        return stockDepositoId;
    }

    public void setStockDepositoId(Long stockDepositoId) {
        this.stockDepositoId = stockDepositoId;
    }

    public String getStockDepositoName() {
        return stockDepositoName;
    }

    public void setStockDepositoName(String stockDepositoName) {
        this.stockDepositoName = stockDepositoName;
    }

    @Override
    public String getProductoName() {
        return super.getProductoName();
    }

    @Override
    public void setProductoName(String productoName) {
        super.setProductoName(productoName);
    }

    @Override
    public String getProductoCodigo() {
        return super.getProductoCodigo();
    }

    @Override
    public void setProductoCodigo(String productoCodigo) {
        super.setProductoCodigo(productoCodigo);
    }

    @Override
    public String getProductoCodigoBarras() {
        return super.getProductoCodigoBarras();
    }

    @Override
    public void setProductoCodigoBarras(String productoCodigoBarras) {
        super.setProductoCodigoBarras(productoCodigoBarras);
    }

    @Override
    public String getProductoMarcaName() {
        return super.getProductoMarcaName();
    }

    @Override
    public void setProductoMarcaName(String productoMarcaName) {
        super.setProductoMarcaName(productoMarcaName);
    }

    @Override
    public String getProductoRubroName() {
        return super.getProductoRubroName();
    }

    @Override
    public void setProductoRubroName(String productoRubroName) {
        super.setProductoRubroName(productoRubroName);
    }

    @Override
    public double getProductoEstado() {
        return super.getProductoEstado();
    }

    @Override
    public void setProductoEstado(double productoEstado) {
        super.setProductoEstado(productoEstado);
    }

    @Override
    public Long getProductoMarcaId() {
        return super.getProductoMarcaId();
    }

    @Override
    public void setProductoMarcaId(Long productoMarcaId) {
        super.setProductoMarcaId(productoMarcaId);
    }

    @Override
    public Long getProductoRubroId() {
        return super.getProductoRubroId();
    }

    @Override
    public void setProductoRubroId(Long productoRubroId) {
        super.setProductoRubroId(productoRubroId);
    }

    @Override
    public Long getProductoProveedorId() {
        return super.getProductoProveedorId();
    }

    @Override
    public void setProductoProveedorId(Long productoProveedorId) {
        super.setProductoProveedorId(productoProveedorId);
    }

    @Override
    public String getProductoPrimerAtributoName() {
        return super.getProductoPrimerAtributoName();
    }

    @Override
    public void setProductoPrimerAtributoName(String productoPrimerAtributoName) {
        super.setProductoPrimerAtributoName(productoPrimerAtributoName);
    }

    @Override
    public String getProductoSegundoAtributoName() {
        return super.getProductoSegundoAtributoName();
    }

    @Override
    public void setProductoSegundoAtributoName(String productoSegundoAtributoName) {
        super.setProductoSegundoAtributoName(productoSegundoAtributoName);
    }

    @Override
    public String getProductoTercerAtributoName() {
        return super.getProductoTercerAtributoName();
    }

    @Override
    public void setProductoTercerAtributoName(String productoTercerAtributoName) {
        super.setProductoTercerAtributoName(productoTercerAtributoName);
    }

    @Override
    public Long getProductoId() {
        return super.getProductoId();
    }

    @Override
    public void setProductoId(Long productoId) {
        super.setProductoId(productoId);
    }

    @Override
    public int getPage() {
        return super.getPage();
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public String getOrder() {
        return super.getOrder();
    }

    @Override
    public Long getSucursalId() {
        return super.getSucursalId();
    }

    @Override
    public String toString() {
        return "StockFilter{" +
                "stockId=" + stockId +
                ", stockDepositoId=" + stockDepositoId +
                ", stockDepositoName='" + stockDepositoName + '\'' +
                '}';
    }
}
