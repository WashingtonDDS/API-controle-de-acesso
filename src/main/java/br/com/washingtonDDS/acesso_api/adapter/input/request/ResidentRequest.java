package br.com.washingtonDDS.acesso_api.adapter.input.request;


import br.com.washingtonDDS.acesso_api.core.domain.model.Person;

public record ResidentRequest( String cpf, String address, String phone, Person person){}
