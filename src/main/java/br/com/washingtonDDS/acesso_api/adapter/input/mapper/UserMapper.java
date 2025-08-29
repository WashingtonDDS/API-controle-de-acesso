package br.com.washingtonDDS.acesso_api.adapter.input.mapper;

import br.com.washingtonDDS.acesso_api.adapter.input.request.UserRequest;
import br.com.washingtonDDS.acesso_api.adapter.output.entity.UserEntity;
import br.com.washingtonDDS.acesso_api.core.domain.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface UserMapper {


    UserRequest toRequest( User user);

    User toDomain(UserEntity userEntity);

    User toDomain(UserRequest userRequest);

    UserEntity toEntity(User user);
}
