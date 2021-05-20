package com.prysoft.pdv.dto;

public class ProductFilter extends CommercialBranchFilter {
    private Long productoId;
    private String productoName;
    private String productoCodigo;
    private String productoCodigoBarras;
    private String productoMarcaName;
    private String productoRubroName;
    private double productoEstado;
    private Long productoMarcaId;
    private Long productoRubroId;
    private Long productoProveedorId;
    private String productoPrimerAtributoName;
    private String productoSegundoAtributoName;
    private String productoTercerAtributoName;

    public String getProductoName() {
        return productoName;
    }

    public void setProductoName(String productoName) {
        this.productoName = productoName;
    }

    public String getProductoCodigo() {
        return productoCodigo;
    }

    public void setProductoCodigo(String productoCodigo) {
        this.productoCodigo = productoCodigo;
    }

    public String getProductoCodigoBarras() {
        return productoCodigoBarras;
    }

    public void setProductoCodigoBarras(String productoCodigoBarras) {
        this.productoCodigoBarras = productoCodigoBarras;
    }

    public String getProductoMarcaName() {
        return productoMarcaName;
    }

    public void setProductoMarcaName(String productoMarcaName) {
        this.productoMarcaName = productoMarcaName;
    }

    public String getProductoRubroName() {
        return productoRubroName;
    }

    public void setProductoRubroName(String productoRubroName) {
        this.productoRubroName = productoRubroName;
    }

    public double getProductoEstado() {
        return productoEstado;
    }

    public void setProductoEstado(double productoEstado) {
        this.productoEstado = productoEstado;
    }

    public Long getProductoMarcaId() {
        return productoMarcaId;
    }

    public void setProductoMarcaId(Long productoMarcaId) {
        this.productoMarcaId = productoMarcaId;
    }

    public Long getProductoRubroId() {
        return productoRubroId;
    }

    public void setProductoRubroId(Long productoRubroId) {
        this.productoRubroId = productoRubroId;
    }

    public Long getProductoProveedorId() {
        return productoProveedorId;
    }

    public void setProductoProveedorId(Long productoProveedorId) {
        this.productoProveedorId = productoProveedorId;
    }

    public String getProductoPrimerAtributoName() {
        return productoPrimerAtributoName;
    }

    public void setProductoPrimerAtributoName(String productoPrimerAtributoName) {
        this.productoPrimerAtributoName = productoPrimerAtributoName;
    }

    public String getProductoSegundoAtributoName() {
        return productoSegundoAtributoName;
    }

    public void setProductoSegundoAtributoName(String productoSegundoAtributoName) {
        this.productoSegundoAtributoName = productoSegundoAtributoName;
    }

    public String getProductoTercerAtributoName() {
        return productoTercerAtributoName;
    }

    public void setProductoTercerAtributoName(String productoTercerAtributoName) {
        this.productoTercerAtributoName = productoTercerAtributoName;
    }

    public Long getProductoId() {
        return productoId;
    }

    public void setProductoId(Long productoId) {
        this.productoId = productoId;
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
        return "ProductoFilter{" +
                "productoId=" + productoId +
                ", productoName='" + productoName + '\'' +
                ", productoCodigo='" + productoCodigo + '\'' +
                ", productoCodigoBarras='" + productoCodigoBarras + '\'' +
                ", productoMarcaName='" + productoMarcaName + '\'' +
                ", productoRubroName='" + productoRubroName + '\'' +
                ", productoEstado=" + productoEstado +
                ", productoMarcaId=" + productoMarcaId +
                ", productoRubroId=" + productoRubroId +
                ", productoProveedorId=" + productoProveedorId +
                ", productoPrimerAtributoName='" + productoPrimerAtributoName + '\'' +
                ", productoSegundoAtributoName='" + productoSegundoAtributoName + '\'' +
                ", productoTercerAtributoName='" + productoTercerAtributoName + '\'' +
                '}';
    }
}
