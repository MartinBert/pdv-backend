package com.prysoft.pdv.dto;

public class PersonaFilter extends CommercialBranchFilter {
    private String personaSocialReason;
    private String personaName;
    private String personaCuit;
    private String personaDirection;
    private String personaContactName;

    public String getPersonaSocialReason() {
        return personaSocialReason;
    }

    public void setPersonaSocialReason(String personaSocialReason) {
        this.personaSocialReason = personaSocialReason;
    }

    public String getPersonaName() {
        return personaName;
    }

    public void setPersonaName(String personaName) {
        this.personaName = personaName;
    }

    public String getPersonaCuit() {
        return personaCuit;
    }

    public void setPersonaCuit(String personaCuit) {
        this.personaCuit = personaCuit;
    }

    public String getPersonaDirection() {
        return personaDirection;
    }

    public void setPersonaDirection(String personaDirection) {
        this.personaDirection = personaDirection;
    }

    public String getPersonaContactName() {
        return personaContactName;
    }

    public void setPersonaContactName(String personaContactName) {
        this.personaContactName = personaContactName;
    }

    @Override
    public Long getSucursalId() {
        return super.getSucursalId();
    }

    @Override
    public void setSucursalId(Long sucursalId) {
        super.setSucursalId(sucursalId);
    }

    @Override
    public String getSucursalName() {
        return super.getSucursalName();
    }

    @Override
    public void setSucursalName(String sucursalName) {
        super.setSucursalName(sucursalName);
    }

    @Override
    public String getSucursalSocialReason() {
        return super.getSucursalSocialReason();
    }

    @Override
    public void setSucursalSocialReason(String sucursalSocialReason) {
        super.setSucursalSocialReason(sucursalSocialReason);
    }

    @Override
    public String getSucursalCuit() {
        return super.getSucursalCuit();
    }

    @Override
    public void setSucursalCuit(String sucursalCuit) {
        super.setSucursalCuit(sucursalCuit);
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
        return "PersonaFilter{" +
                "personaSocialReason='" + personaSocialReason + '\'' +
                ", personaName='" + personaName + '\'' +
                ", personaCuit='" + personaCuit + '\'' +
                ", personaDirection='" + personaDirection + '\'' +
                ", personaContactName='" + personaContactName + '\'' +
                '}';
    }
}
