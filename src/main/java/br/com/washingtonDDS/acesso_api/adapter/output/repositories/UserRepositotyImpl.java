package br.com.washingtonDDS.acesso_api.adapter.output.repositories;

import br.com.washingtonDDS.acesso_api.core.domain.model.User;
import br.com.washingtonDDS.acesso_api.port.output.UserOutputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserRepositotyImpl implements UserOutputPort {
    private final UserRepository  userRepository;

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }
}
