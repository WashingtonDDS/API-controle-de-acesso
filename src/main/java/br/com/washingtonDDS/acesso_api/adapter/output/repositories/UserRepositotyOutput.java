package br.com.washingtonDDS.acesso_api.adapter.output.repositories;

import br.com.washingtonDDS.acesso_api.adapter.input.mapper.PersonMapper;
import br.com.washingtonDDS.acesso_api.adapter.input.mapper.UserMapper;
import br.com.washingtonDDS.acesso_api.adapter.output.entity.PersonEntity;
import br.com.washingtonDDS.acesso_api.adapter.output.entity.UserEntity;
import br.com.washingtonDDS.acesso_api.core.domain.model.User;
import br.com.washingtonDDS.acesso_api.port.output.UserOutputPort;
import org.springframework.stereotype.Component;

@Component
public class UserRepositotyOutput implements UserOutputPort {
    private final UserRepository  userRepository;

    private final PersonRepository personRepository;

    private final UserMapper userMapper;

    private final PersonMapper personMapper;

    public UserRepositotyOutput(UserRepository userRepository, PersonRepository personRepository, UserMapper userMapper, PersonMapper personMapper) {
        this.userRepository = userRepository;
        this.personRepository = personRepository;
        this.userMapper = userMapper;
        this.personMapper = personMapper;
    }

    @Override
    public User save(User user) {
        UserEntity userEntity = userMapper.toEntity(user);

        PersonEntity savedPerson = personMapper.toEntityPerson(user.getPerson());
        savedPerson = personRepository.save(savedPerson);
        userEntity.setPerson(savedPerson);

        UserEntity newUser = userRepository.save(userEntity);
        return userMapper.toDomainEntity(newUser);
    }

    @Override
    public User getByemail(String email) {
        UserEntity userByEmail = userRepository.findByEmail(email);
        return userMapper.toDomainEntity(userByEmail);
    }


}
