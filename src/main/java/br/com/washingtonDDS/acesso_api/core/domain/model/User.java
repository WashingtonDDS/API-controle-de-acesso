package br.com.washingtonDDS.acesso_api.core.domain.model;

public class User {
   private Long id;
   private String email;
   private String password;
   private Boolean administrator;
   private Person person;

    public User() {
    }


    public User(Long id, String email, String password, Boolean administrator,Person person) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.administrator = administrator;
        this.person = person;
    }
    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getAdministrator() {
        return administrator;
    }

    public void setAdministrator(Boolean administrator) {
        this.administrator = administrator;
    }
}
