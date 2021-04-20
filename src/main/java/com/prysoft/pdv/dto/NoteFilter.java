package com.prysoft.pdv.dto;

import org.apache.fop.area.Page;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.Date;

@Service
public class NoteFilter extends PageFilter {

    private String name;
    private String details;

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    private Date fecha;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    @Override
    public String toString() {
        return "NoteFilter{" +
                "name='" + name + '\'' +
                ", details='" + details + '\'' +
                '}';
    }



    public void setDetails(String details) {
        this.details = details;
    }



}
