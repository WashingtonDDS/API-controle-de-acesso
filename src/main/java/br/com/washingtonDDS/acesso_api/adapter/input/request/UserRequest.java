package br.com.washingtonDDS.acesso_api.adapter.input.request;

import br.com.washingtonDDS.acesso_api.core.domain.model.Person;

public record UserRequest (String email,
                          String password,
                          Boolean administrator, Person person
                          ) {

}

