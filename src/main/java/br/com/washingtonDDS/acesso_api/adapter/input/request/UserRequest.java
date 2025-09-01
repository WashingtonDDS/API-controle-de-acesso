package br.com.washingtonDDS.acesso_api.adapter.input.request;
import br.com.washingtonDDS.acesso_api.core.domain.model.Person;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserRequest {
    private Long id;
    private String email;
    private String password;
    private Boolean administrator;
    private Person person;

}

