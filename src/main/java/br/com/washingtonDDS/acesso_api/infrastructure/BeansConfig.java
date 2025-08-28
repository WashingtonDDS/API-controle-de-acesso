package br.com.washingtonDDS.acesso_api.infrastructure;

import br.com.washingtonDDS.acesso_api.core.usecase.UserUseCase;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public UserUseCase userUseCaseimpl(){
        return new UserUseCase();
    }
}
