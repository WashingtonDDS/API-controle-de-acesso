package br.com.washingtonDDS.acesso_api.adapter.output.repositories;

import br.com.washingtonDDS.acesso_api.adapter.input.mapper.PersonMapper;
import br.com.washingtonDDS.acesso_api.adapter.input.mapper.VisitorMapper;
import br.com.washingtonDDS.acesso_api.adapter.output.entity.PersonEntity;
import br.com.washingtonDDS.acesso_api.adapter.output.entity.VisitorEntity;
import br.com.washingtonDDS.acesso_api.core.domain.model.Visitor;
import br.com.washingtonDDS.acesso_api.port.output.VisitorOutputPort;
import org.springframework.stereotype.Component;

@Component
public class VisitorRepositoryOutput implements VisitorOutputPort {
    private final VisitorRepository visitorRepository;

    private final PersonRepository personRepository;

    private final VisitorMapper visitorMapper;

    private final PersonMapper personMapper;

    public VisitorRepositoryOutput(VisitorRepository visitorRepository, PersonRepository personRepository, VisitorMapper visitorMapper, PersonMapper personMapper) {
        this.visitorRepository = visitorRepository;
        this.personRepository = personRepository;
        this.visitorMapper = visitorMapper;
        this.personMapper = personMapper;
    }

    @Override
    public Visitor save(Visitor visitor) {
        VisitorEntity visitorEntity = visitorMapper.toEntity(visitor);

        PersonEntity savedPersonEntity = personMapper.toEntityPerson(visitor.getPerson());
        savedPersonEntity = personRepository.save(savedPersonEntity);
        visitorEntity.setPerson(savedPersonEntity);

        VisitorEntity newVisitor = visitorRepository.save(visitorEntity);
        return visitorMapper.toDomainEntity(newVisitor);
    }

    @Override
    public Visitor getByRg(String rg) {
        VisitorEntity visitorByRg = visitorRepository.findByRg(rg);
        return visitorMapper.toDomainEntity(visitorByRg);
    }
}
