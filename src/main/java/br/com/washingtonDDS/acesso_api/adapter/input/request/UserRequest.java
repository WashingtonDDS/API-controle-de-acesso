package br.com.washingtonDDS.acesso_api.adapter.input.request;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserRequest {
    private Long id;
    private String name;
    private String email;
    private String password;
    private Boolean administrator;


}
