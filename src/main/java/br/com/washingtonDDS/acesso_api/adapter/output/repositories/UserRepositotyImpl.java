package br.com.washingtonDDS.acesso_api.adapter.output.repositories;

import br.com.washingtonDDS.acesso_api.adapter.input.mapper.UserMapper;
import br.com.washingtonDDS.acesso_api.adapter.output.entity.UserEntity;
import br.com.washingtonDDS.acesso_api.core.domain.model.User;
import br.com.washingtonDDS.acesso_api.port.output.UserOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component

public class UserRepositotyImpl implements UserOutputPort {
    private final UserRepository  userRepository;

    private final UserMapper userMapper;

    public UserRepositotyImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public User save(User user) {

        UserEntity userEntity = userMapper.toEntity(user);
        UserEntity newUser = userRepository.save(userEntity);
        return userMapper.toDomain(newUser);
    }
}
