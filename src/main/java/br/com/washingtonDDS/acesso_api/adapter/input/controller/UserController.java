package br.com.washingtonDDS.acesso_api.adapter.input.controller;

import br.com.washingtonDDS.acesso_api.adapter.input.request.UserRequest;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
public class UserController {

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public UserRequest create(@RequestBody UserRequest userRequest){
        return userRequest;
    }
}
