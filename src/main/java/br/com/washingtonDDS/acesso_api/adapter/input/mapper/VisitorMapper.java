package br.com.washingtonDDS.acesso_api.adapter.input.mapper;

import br.com.washingtonDDS.acesso_api.adapter.input.request.VisitorResponseDto;
import br.com.washingtonDDS.acesso_api.adapter.input.request.VisitorResquest;
import br.com.washingtonDDS.acesso_api.adapter.output.entity.VisitorEntity;
import br.com.washingtonDDS.acesso_api.core.domain.model.Visitor;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface VisitorMapper {

    VisitorResquest toRequest(Visitor visitor);

    Visitor toDomain(VisitorResquest visitorResquest);

    Visitor toDomainEntity(VisitorEntity visitorEntity);

    VisitorEntity toEntity(Visitor visitor);

    VisitorResponseDto toResponseDto(Visitor visitor);
}
