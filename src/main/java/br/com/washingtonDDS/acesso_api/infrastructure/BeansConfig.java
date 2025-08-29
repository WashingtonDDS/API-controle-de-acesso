package br.com.washingtonDDS.acesso_api.infrastructure;

import br.com.washingtonDDS.acesso_api.adapter.input.mapper.UserMapper;
import br.com.washingtonDDS.acesso_api.core.usecase.UserUseCase;
import br.com.washingtonDDS.acesso_api.port.output.UserOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {


    @Bean
    public UserUseCase userUseCaseimpl(UserOutputPort userOutputPort){
        return new UserUseCase(userOutputPort);
    }
}
