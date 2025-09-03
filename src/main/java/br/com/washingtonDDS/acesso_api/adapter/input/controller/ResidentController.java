package br.com.washingtonDDS.acesso_api.adapter.input.controller;

import br.com.washingtonDDS.acesso_api.adapter.input.mapper.ResidentMapper;
import br.com.washingtonDDS.acesso_api.adapter.input.request.ResidentRequest;
import br.com.washingtonDDS.acesso_api.adapter.input.request.ResidentResponseDto;
import br.com.washingtonDDS.acesso_api.core.domain.model.Resident;
import br.com.washingtonDDS.acesso_api.port.input.ResidentInputPort;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/residents")
@RequiredArgsConstructor
public class ResidentController {


    private final ResidentInputPort residentInputPort;

    private final ResidentMapper residentMapper;


    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResidentResponseDto create(@Validated @RequestBody ResidentRequest residentRequest) {
        Resident resident = residentMapper.toDomainResident(residentRequest);
        Resident newResident = residentInputPort.create(resident);
        return residentMapper.toResidentResponseDto(newResident);
    }
}
