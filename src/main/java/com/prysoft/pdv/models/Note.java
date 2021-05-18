package com.prysoft.pdv.models;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Time;


@Entity
@Table(name = "Note")
public class Note implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String Starthour;

    public String getHourStart() {
        return Starthour;
    }

    public void setStarthour(String Starthour) {
        this.Starthour = Starthour;
    }

    public String getHourEnd() {
        return Endhour;
    }

    public void setEndhour(String Endhour) {
        this.Endhour = Endhour;
    }

    private String Endhour;

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


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    private String details;


}
