package br.com.washingtonDDS.acesso_api.core.usecase;

import br.com.washingtonDDS.acesso_api.core.domain.model.User;
import br.com.washingtonDDS.acesso_api.port.input.UserInputPort;
import br.com.washingtonDDS.acesso_api.port.output.UserOutputPort;

public class UserUseCase implements UserInputPort {

    private final UserOutputPort userOutputPort;

    public UserUseCase(UserOutputPort userOutputPort) {
        this.userOutputPort = userOutputPort;
    }

    @Override
    public User create(User user) {
        User userExist = userOutputPort.getByemail(user.getEmail());
        if (userExist != null){
            throw new IllegalArgumentException("User already exists");
        }
        return userOutputPort.save(user);
    }
}
