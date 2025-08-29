package br.com.washingtonDDS.acesso_api.adapter.input.request;
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
    private PersonRequest personRequest;

}

