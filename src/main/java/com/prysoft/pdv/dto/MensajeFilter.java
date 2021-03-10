package com.prysoft.pdv.dto;

public class MensajeFilter extends PageFilter{
    private String mensajeNameAndLastName;
    private String mensajeContactPhoneOrEmail;
    private String mensajeMessage;
    private String mensajeDate;

    public String getMensajeNameAndLastName() {
        return mensajeNameAndLastName;
    }

    public void setMensajeNameAndLastName(String mensajeNameAndLastName) {
        this.mensajeNameAndLastName = mensajeNameAndLastName;
    }

    public String getMensajeContactPhoneOrEmail() {
        return mensajeContactPhoneOrEmail;
    }

    public void setMensajeContactPhoneOrEmail(String mensajeContactPhoneOrEmail) {
        this.mensajeContactPhoneOrEmail = mensajeContactPhoneOrEmail;
    }

    public String getMensajeMessage() {
        return mensajeMessage;
    }

    public void setMensajeMessage(String mensajeMessage) {
        this.mensajeMessage = mensajeMessage;
    }

    public String getMensajeDate() {
        return mensajeDate;
    }

    public void setMensajeDate(String mensajeDate) {
        this.mensajeDate = mensajeDate;
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
        return "MensajeFilter{" +
                "mensajeNameAndLastName='" + mensajeNameAndLastName + '\'' +
                ", mensajeContactPhoneOrEmail='" + mensajeContactPhoneOrEmail + '\'' +
                ", mensajeMessage='" + mensajeMessage + '\'' +
                ", mensajeDate='" + mensajeDate + '\'' +
                '}';
    }
}
