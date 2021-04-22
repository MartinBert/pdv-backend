package com.prysoft.pdv.dto;


import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class NoteFilter extends PageFilter {

    private String name;
    private String details;
    private Date startEvent;
    private Date endEvent;

    public Date getStartEvent() {
        return startEvent;
    }

    public void setStartEvent(Date startEvent) {
        this.startEvent = startEvent;
    }

    public Date getEndEvent() {
        return endEvent;
    }

    public void setEndEvent(Date endEvent) {
        this.endEvent = endEvent;
    }

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
                ", startEvent=" + startEvent +
                ", endEvent=" + endEvent +
                ", fecha=" + fecha +
                '}';
    }


    public void setDetails(String details) {
        this.details = details;
    }



}
