package br.com.washingtonDDS.acesso_api.core.usecase;

import br.com.washingtonDDS.acesso_api.core.domain.model.User;
import br.com.washingtonDDS.acesso_api.port.input.UserInputPort;

public class UserUseCase implements UserInputPort {
    @Override
    public User create(User user) {
        return user;
    }
}
