package br.com.washingtonDDS.acesso_api.core.domain.model;

public class Visitor {
    private Long id;
    private String rg;
    private Long idPerson;

    public Visitor() {
    }

    public Visitor(Long id, String rg, Long idPerson) {
        this.id = id;
        this.rg = rg;
        this.idPerson = idPerson;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public Long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Long idPerson) {
        this.idPerson = idPerson;
    }
}
