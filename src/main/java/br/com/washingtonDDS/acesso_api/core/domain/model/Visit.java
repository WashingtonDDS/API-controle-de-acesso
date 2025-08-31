package br.com.washingtonDDS.acesso_api.core.domain.model;

import java.time.LocalDateTime;

public class Visit {
    private Long id;
    private LocalDateTime dateTime;
    private Resident resident;
    private Visitor visitor;

    public Visit() {
    }

    public Visit(Long id, LocalDateTime dateTime, Resident resident, Visitor visitor) {
        this.id = id;
        this.dateTime = dateTime;
        this.resident = resident;
        this.visitor = visitor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Resident getResident() {
        return resident;
    }

    public void setResident(Resident resident) {
        this.resident = resident;
    }

    public Visitor getVisitor() {
        return visitor;
    }

    public void setVisitor(Visitor visitor) {
        this.visitor = visitor;
    }
}
