package com.prysoft.pdv.dto;

public class EmpresaFilter extends PerfilFilter {
    private Long empresaId;
    private String empresaName;
    private String empresaSocialReason;
    private String empresaCuit;

    public Long getEmpresaId() {
        return empresaId;
    }

    public void setEmpresaId(Long empresaId) {
        this.empresaId = empresaId;
    }

    public String getEmpresaName() {
        return empresaName;
    }

    public void setEmpresaName(String empresaName) {
        this.empresaName = empresaName;
    }

    public String getEmpresaSocialReason() {
        return empresaSocialReason;
    }

    public void setEmpresaSocialReason(String empresaSocialReason) {
        this.empresaSocialReason = empresaSocialReason;
    }

    public String getEmpresaCuit() {
        return empresaCuit;
    }

    public void setEmpresaCuit(String empresaCuit) {
        this.empresaCuit = empresaCuit;
    }

    @Override
    public Long getPerfilId() {
        return super.getPerfilId();
    }

    @Override
    public void setPerfilId(Long perfilId) {
        super.setPerfilId(perfilId);
    }

    @Override
    public String getPerfilName() {
        return super.getPerfilName();
    }

    @Override
    public void setPerfilName(String perfilName) {
        super.setPerfilName(perfilName);
    }

    @Override
    public int getPage() {
        return super.getPage();
    }

    @Override
    public void setPage(int page) {
        super.setPage(page);
    }

    @Override
    public int getSize() {
        return super.getSize();
    }

    @Override
    public void setSize(int size) {
        super.setSize(size);
    }

    @Override
    public String getOrder() {
        return super.getOrder();
    }

    @Override
    public void setOrder(String order) {
        super.setOrder(order);
    }

    @Override
    public String toString() {
        return "EmpresaFilter{" +
                "empresaId=" + empresaId +
                ", empresaName='" + empresaName + '\'' +
                ", empresaSocialReason='" + empresaSocialReason + '\'' +
                ", empresaCuit='" + empresaCuit + '\'' +
                '}';
    }
}
