package br.com.washingtonDDS.acesso_api.adapter.output.repositories;

import br.com.washingtonDDS.acesso_api.adapter.input.mapper.UserMapper;
import br.com.washingtonDDS.acesso_api.adapter.output.entity.ResidentEntity;
import br.com.washingtonDDS.acesso_api.core.domain.model.Resident;
import br.com.washingtonDDS.acesso_api.port.output.ResidentOutputPort;
import org.springframework.stereotype.Component;

@Component
public class ResidentRepositoryImpl implements ResidentOutputPort {

    private final ResidentRepository residentRepository;

    private final PersonRepository personRepository;

    private final UserMapper userMapper;



    public ResidentRepositoryImpl(ResidentRepository residentRepository, PersonRepository personRepository, UserMapper userMapper) {
        this.residentRepository = residentRepository;
        this.personRepository = personRepository;
        this.userMapper = userMapper;
    }

    @Override
    public Resident save(Resident resident) {
        ResidentEntity residentEntity = userMapper.toEntityResident(resident);
        residentEntity.setPerson(resident.getPerson());
        ResidentEntity newResident = residentRepository.save(residentEntity);
        return userMapper.toDomainResidentEntity(newResident);
    }
}
