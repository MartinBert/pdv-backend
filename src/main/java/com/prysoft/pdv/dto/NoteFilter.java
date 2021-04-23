package com.prysoft.pdv.dto;


import org.exolab.castor.types.DateTime;
import org.springframework.stereotype.Service;
import java.util.Date;

@Service
public class NoteFilter extends PageFilter {

    private String name;
    private String details;
    private String startEvent;

    public String getStartEvent() {
        return startEvent;
    }

    public void setStartEvent(String startEvent) {
        this.startEvent = startEvent;
    }

    public String getEndEvent() {
        return endEvent;
    }

    public void setEndEvent(String endEvent) {
        this.endEvent = endEvent;
    }

    private String endEvent;


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
                '}';
    }


    public void setDetails(String details) {
        this.details = details;
    }



}
