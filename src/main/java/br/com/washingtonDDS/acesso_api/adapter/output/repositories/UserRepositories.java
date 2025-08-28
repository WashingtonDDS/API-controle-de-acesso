package br.com.washingtonDDS.acesso_api.adapter.output.repositories;

import br.com.washingtonDDS.acesso_api.adapter.input.request.UserRequest;
import br.com.washingtonDDS.acesso_api.core.domain.model.User;
import org.springframework.stereotype.Component;

@Component
public class UserRepositories {

    public User toDomain(UserRequest user){
       return new User(user.getId(), user.getEmail(), user.getPassword(), user.getAdministrator());
    }

    public UserRequest toDTO(User user){
        return new UserRequest(user.getId(),null, user.getEmail(), user.getPassword(), user.getAdministrator());
    }
}
