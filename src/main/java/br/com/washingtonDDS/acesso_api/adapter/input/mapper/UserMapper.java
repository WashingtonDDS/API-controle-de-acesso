package br.com.washingtonDDS.acesso_api.adapter.input.mapper;

import br.com.washingtonDDS.acesso_api.adapter.input.request.*;
import br.com.washingtonDDS.acesso_api.adapter.output.entity.PersonEntity;
import br.com.washingtonDDS.acesso_api.adapter.output.entity.ResidentEntity;
import br.com.washingtonDDS.acesso_api.adapter.output.entity.UserEntity;
import br.com.washingtonDDS.acesso_api.core.domain.model.Person;
import br.com.washingtonDDS.acesso_api.core.domain.model.Resident;
import br.com.washingtonDDS.acesso_api.core.domain.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {

    @Mapping(target = "personRequest", source = "person")
    UserRequest toRequest( User user);

    PersonRequest toPersonRequest(Person person);

    @Mapping(target = "person", source = "personEntity")
    User toDomain(UserEntity userEntity);

    Resident toDomainResidentEntity(ResidentEntity residentEntity);

    Resident toDomainResident(ResidentRequest residentRequest);

    @Mapping(target = "person", source = "personRequest")
    User toDomain(UserRequest userRequest);

    Person toPersonDomain(PersonRequest personRequest);

    @Mapping(target = "personEntity", source = "person")
    UserEntity toEntity(User user);

    ResidentEntity toEntityResident(Resident resident);

    PersonEntity toEntityPerson(Person person);

    @Mapping(target = "person", source = "person")
    UserResponseDto toResponseDto(User user);

    @Mapping(target = "id", source = "id")
    @Mapping(target = "name", source = "name")
    PersonResponseDto toPersonResponseDto(Person person);

    ResidentResponseDto toResidentResponseDto(Resident resident);
}
