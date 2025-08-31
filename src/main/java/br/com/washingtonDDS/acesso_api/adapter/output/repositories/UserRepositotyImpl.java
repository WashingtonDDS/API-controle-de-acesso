package br.com.washingtonDDS.acesso_api.adapter.output.repositories;

import br.com.washingtonDDS.acesso_api.adapter.input.mapper.UserMapper;
import br.com.washingtonDDS.acesso_api.adapter.output.entity.PersonEntity;
import br.com.washingtonDDS.acesso_api.adapter.output.entity.UserEntity;
import br.com.washingtonDDS.acesso_api.core.domain.model.Person;
import br.com.washingtonDDS.acesso_api.core.domain.model.User;
import br.com.washingtonDDS.acesso_api.port.output.UserOutputPort;
import org.springframework.stereotype.Component;

@Component

public class UserRepositotyImpl implements UserOutputPort {
    private final UserRepository  userRepository;

    private final PersonRepository personRepository;

    private final UserMapper userMapper;

    public UserRepositotyImpl(UserRepository userRepository, PersonRepository personRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.personRepository = personRepository;
        this.userMapper = userMapper;
    }

    @Override
    public User save(User user) {
        UserEntity userEntity = userMapper.toEntity(user);
        userEntity.setPersonEntity(savePerson(user.getPerson()));
        UserEntity newUser = userRepository.save(userEntity);
        return userMapper.toDomain(newUser);
    }

    @Override
    public User getByemail(String email) {
        UserEntity userByEmail = userRepository.findByEmail(email);
        return userMapper.toDomain(userByEmail);
    }

    private PersonEntity savePerson(Person person) {
        PersonEntity personEntity = userMapper.toEntityPerson(person);
        return personRepository.save(personEntity);
    }
}
