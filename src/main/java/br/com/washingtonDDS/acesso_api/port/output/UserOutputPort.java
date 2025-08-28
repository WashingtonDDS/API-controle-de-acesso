package br.com.washingtonDDS.acesso_api.port.output;

import br.com.washingtonDDS.acesso_api.core.domain.model.User;

public interface UserOutputPort {

    public User save(User user);
}
