package br.com.washingtonDDS.acesso_api.adapter.input.controller;

import br.com.washingtonDDS.acesso_api.adapter.input.request.UserRequest;
import br.com.washingtonDDS.acesso_api.adapter.output.repositories.UserRepositories;
import br.com.washingtonDDS.acesso_api.core.domain.model.User;
import br.com.washingtonDDS.acesso_api.port.input.UserInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
public class UserController {

    @Autowired
    private UserInputPort userInputPort;
    private UserRepositories userRepositories;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserRequest create(@RequestBody UserRequest userRequest){
        User newUser = userInputPort.create(userRepositories.toDomain(userRequest));
        return userRepositories.toDTO(newUser);
    }
}
