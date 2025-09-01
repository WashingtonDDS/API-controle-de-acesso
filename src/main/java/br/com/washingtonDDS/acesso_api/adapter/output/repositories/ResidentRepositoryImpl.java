package br.com.washingtonDDS.acesso_api.adapter.output.repositories;

import br.com.washingtonDDS.acesso_api.adapter.input.mapper.PersonMapper;
import br.com.washingtonDDS.acesso_api.adapter.input.mapper.ResidentMapper;
import br.com.washingtonDDS.acesso_api.adapter.output.entity.PersonEntity;
import br.com.washingtonDDS.acesso_api.adapter.output.entity.ResidentEntity;
import br.com.washingtonDDS.acesso_api.core.domain.model.Resident;
import br.com.washingtonDDS.acesso_api.port.output.ResidentOutputPort;
import org.springframework.stereotype.Component;

@Component
public class ResidentRepositoryImpl implements ResidentOutputPort {

    private final ResidentRepository residentRepository;

    private final PersonRepositoryImpl personRepositoryImpl;

    private final ResidentMapper residentMapper;

    private final PersonMapper personMapper;

    public ResidentRepositoryImpl(ResidentRepository residentRepository, PersonRepositoryImpl personRepositoryImpl, ResidentMapper residentMapper, PersonMapper personMapper) {
        this.residentRepository = residentRepository;
        this.personRepositoryImpl = personRepositoryImpl;
        this.residentMapper = residentMapper;
        this.personMapper = personMapper;
    }


    @Override
    public Resident save(Resident resident) {
        ResidentEntity residentEntity = residentMapper.toEntityResident(resident);

        PersonEntity savedPersonEntity = personRepositoryImpl.savePerson(resident.getPerson());
        residentEntity.setPerson(personMapper.toDomainPerson(savedPersonEntity));

        ResidentEntity newResident = residentRepository.save(residentEntity);
        return residentMapper.toDomainResidentEntity(newResident);
    }

    @Override
    public Resident getByCpf(String cpf) {
        return null;
    }
}
