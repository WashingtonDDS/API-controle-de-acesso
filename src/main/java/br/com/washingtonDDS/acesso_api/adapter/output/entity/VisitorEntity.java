package br.com.washingtonDDS.acesso_api.adapter.output.entity;

import br.com.washingtonDDS.acesso_api.core.domain.model.Person;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter

@Table(name = "visitor")
public class VisitorEntity {
    @Id
    @GeneratedValue
    private Long id;

    private String rg;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id")
    private PersonEntity person;

}
