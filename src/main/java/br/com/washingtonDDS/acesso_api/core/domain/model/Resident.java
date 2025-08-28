package br.com.washingtonDDS.acesso_api.core.domain.model;

public class Resident {
    private Long id;
    private String cpf;
    private String address;
    private String phone;
    private Long idPerson;

    public Resident() {
    }

    public Resident(Long id, String cpf, String address, String phone, Long idPerson) {
        this.id = id;
        this.cpf = cpf;
        this.address = address;
        this.phone = phone;
        this.idPerson = idPerson;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(Long idPerson) {
        this.idPerson = idPerson;
    }
}
