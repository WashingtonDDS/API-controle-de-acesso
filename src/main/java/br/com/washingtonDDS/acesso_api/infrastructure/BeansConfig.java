package br.com.washingtonDDS.acesso_api.infrastructure;

import br.com.washingtonDDS.acesso_api.adapter.input.mapper.UserMapper;
import br.com.washingtonDDS.acesso_api.adapter.output.entity.PersonEntity;
import br.com.washingtonDDS.acesso_api.core.domain.model.Person;
import br.com.washingtonDDS.acesso_api.core.usecase.ResidentUseCase;
import br.com.washingtonDDS.acesso_api.core.usecase.UserUseCase;
import br.com.washingtonDDS.acesso_api.core.usecase.VisitorUseCase;
import br.com.washingtonDDS.acesso_api.port.output.ResidentOutputPort;
import br.com.washingtonDDS.acesso_api.port.output.UserOutputPort;
import br.com.washingtonDDS.acesso_api.port.output.VisitorOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public UserUseCase userUseCase(UserOutputPort userOutputPort){
        return new UserUseCase(userOutputPort);
    }

    @Bean
    public ResidentUseCase residentUseCase(ResidentOutputPort residentOutputPort){
        return new ResidentUseCase(residentOutputPort);
    }

    @Bean
    public VisitorUseCase visitorUseCase(VisitorOutputPort visitorOutputPort) {
        return  new VisitorUseCase(visitorOutputPort);
    }
}
