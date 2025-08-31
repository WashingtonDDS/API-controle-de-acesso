package br.com.washingtonDDS.acesso_api.adapter.input.request;

import br.com.washingtonDDS.acesso_api.core.domain.model.Person;

public class ResidentRequest {
    private Long id;
    private String cpf;
    private String address;
    private String phone;
    private Person person;

    public ResidentRequest() {
    }

    public ResidentRequest(Long id, String cpf, String address, String phone, Person person) {
        this.id = id;
        this.cpf = cpf;
        this.address = address;
        this.phone = phone;
        this.person = person;
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

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
