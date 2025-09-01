package br.com.washingtonDDS.acesso_api.adapter.input.mapper;


import br.com.washingtonDDS.acesso_api.adapter.input.request.ResidentRequest;
import br.com.washingtonDDS.acesso_api.adapter.input.request.ResidentResponseDto;
import br.com.washingtonDDS.acesso_api.adapter.output.entity.ResidentEntity;
import br.com.washingtonDDS.acesso_api.core.domain.model.Resident;
import org.mapstruct.Mapper;
import org.mapstruct.MappingConstants;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)
public interface ResidentMapper {

    Resident toDomainResidentEntity(ResidentEntity residentEntity);

    Resident toDomainResident(ResidentRequest residentRequest);

    ResidentResponseDto toResidentResponseDto(Resident resident);

    ResidentEntity toEntityResident(Resident resident);

}
