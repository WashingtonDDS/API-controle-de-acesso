package br.com.washingtonDDS.acesso_api.port.input;

import br.com.washingtonDDS.acesso_api.core.domain.model.User;

public interface UserInputPort {
    User create(User user);
}
