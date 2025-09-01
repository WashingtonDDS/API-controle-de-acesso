package br.com.washingtonDDS.acesso_api.adapter.output.repositories;

import br.com.washingtonDDS.acesso_api.adapter.input.mapper.PersonMapper;
import br.com.washingtonDDS.acesso_api.adapter.output.entity.PersonEntity;
import br.com.washingtonDDS.acesso_api.core.domain.model.Person;
import org.springframework.stereotype.Component;

@Component
public class PersonRepositoryImpl {

    private final PersonRepository personRepository;
    private final PersonMapper personMapper;

    public PersonRepositoryImpl(PersonRepository personRepository, PersonMapper personMapper) {
        this.personRepository = personRepository;
        this.personMapper = personMapper;
    }
    public PersonEntity savePerson(Person person) {
        PersonEntity personEntity = personMapper.toEntityPerson(person);
        return personRepository.save(personEntity);
    }
}
