package br.com.washingtonDDS.acesso_api.adapter.input.controller;

import br.com.washingtonDDS.acesso_api.adapter.input.mapper.VisitorMapper;
import br.com.washingtonDDS.acesso_api.adapter.input.request.VisitorResponseDto;
import br.com.washingtonDDS.acesso_api.adapter.input.request.VisitorResquest;
import br.com.washingtonDDS.acesso_api.core.domain.model.Visitor;
import br.com.washingtonDDS.acesso_api.port.input.VisitorInputPort;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/visitors")
public class VisitorController {

    private final VisitorInputPort visitorInputPort;

    private final VisitorMapper visitorMapper;

    public VisitorController(VisitorInputPort visitorInputPort, VisitorMapper visitorMapper) {
        this.visitorInputPort = visitorInputPort;
        this.visitorMapper = visitorMapper;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public VisitorResponseDto create(@RequestBody VisitorResquest visitorResquest) {
        Visitor visitor = visitorMapper.toDomain(visitorResquest);
        Visitor newVisitor = visitorInputPort.create(visitor);
        return visitorMapper.toResponseDto(newVisitor);
    }
}
