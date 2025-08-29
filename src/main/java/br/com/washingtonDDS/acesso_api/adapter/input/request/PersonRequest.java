package br.com.washingtonDDS.acesso_api.adapter.input.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class PersonRequest {
    private Long id;
    private String name;
}