package br.com.washingtonDDS.acesso_api.adapter.input.mapper;

import br.com.washingtonDDS.acesso_api.adapter.input.request.PersonRequest;
import br.com.washingtonDDS.acesso_api.adapter.input.request.PersonResponseDto;
import br.com.washingtonDDS.acesso_api.adapter.output.entity.PersonEntity;
import br.com.washingtonDDS.acesso_api.core.domain.model.Person;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface PersonMapper {

    PersonRequest toPersonRequest(Person person);

    Person toPersonDomain(PersonRequest personRequest);

    Person toDomainPerson(PersonEntity personEntity);

    PersonEntity toEntityPerson(Person person);

    PersonResponseDto toPersonResponseDto(Person person);


}
