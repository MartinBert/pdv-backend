package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "mensajes")
public class Message implements Serializable {
    private static final long serialVersionUID = 999999999999999999L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nameAndLastName;
    private String contactPhoneOrEmail;
    private String message;
    private String date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameAndLastName() {
        return nameAndLastName;
    }

    public void setNameAndLastName(String nameAndLastName) {
        this.nameAndLastName = nameAndLastName;
    }

    public String getContactPhoneOrEmail() {
        return contactPhoneOrEmail;
    }

    public void setContactPhoneOrEmail(String contactPhoneOrEmail) {
        this.contactPhoneOrEmail = contactPhoneOrEmail;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", nameAndLastName='" + nameAndLastName + '\'' +
                ", contactPhoneOrEmail='" + contactPhoneOrEmail + '\'' +
                ", message='" + message + '\'' +
                ", date=" + date +
                '}';
    }
}
