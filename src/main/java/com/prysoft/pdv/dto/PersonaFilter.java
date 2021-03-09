package com.prysoft.pdv.dto;

public abstract class PersonaFilter extends SucursalFilter{
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
    public int getPage() {
        return super.getPage();
    }

    @Override
    public int getSize() {
        return super.getSize();
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
