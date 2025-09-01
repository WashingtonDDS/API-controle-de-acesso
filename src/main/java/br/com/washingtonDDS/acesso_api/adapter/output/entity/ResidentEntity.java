package br.com.washingtonDDS.acesso_api.adapter.output.entity;

import br.com.washingtonDDS.acesso_api.core.domain.model.Person;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "resident")
public class ResidentEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String cpf;
    private String address;
    private String phone;
    private Person person;

}
