package br.com.washingtonDDS.acesso_api.adapter.output.repositories;

import br.com.washingtonDDS.acesso_api.adapter.input.mapper.PersonMapper;
import br.com.washingtonDDS.acesso_api.adapter.input.mapper.ResidentMapper;
import br.com.washingtonDDS.acesso_api.adapter.output.entity.PersonEntity;
import br.com.washingtonDDS.acesso_api.adapter.output.entity.ResidentEntity;
import br.com.washingtonDDS.acesso_api.core.domain.model.Resident;
import br.com.washingtonDDS.acesso_api.port.output.ResidentOutputPort;

import org.springframework.stereotype.Component;

@Component
public class ResidentRepositoryOutput implements ResidentOutputPort {

    private final ResidentRepository residentRepository;

    private final PersonRepository personRepository;


    private final ResidentMapper residentMapper;

    private final PersonMapper personMapper;

    public ResidentRepositoryOutput(ResidentRepository residentRepository, PersonRepository personRepository, ResidentMapper residentMapper, PersonMapper personMapper) {
        this.residentRepository = residentRepository;
        this.personRepository = personRepository;
        this.residentMapper = residentMapper;
        this.personMapper = personMapper;
    }


    @Override
    public Resident save(Resident resident) {
        ResidentEntity residentEntity = residentMapper.toEntityResident(resident);

        PersonEntity savedPersonEntity = personMapper.toEntityPerson(resident.getPerson());
        savedPersonEntity = personRepository.save(savedPersonEntity);
        residentEntity.setPerson(savedPersonEntity);

        ResidentEntity newResident = residentRepository.save(residentEntity);
        return residentMapper.toDomainResidentEntity(newResident);
    }

    @Override
    public Resident getByCpf(String cpf) {
        ResidentEntity residentByCpf = residentRepository.findByCpf(cpf);
        return residentMapper.toDomainResidentEntity(residentByCpf);
    }
}
