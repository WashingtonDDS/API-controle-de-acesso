package br.com.washingtonDDS.acesso_api.adapter.input.controller;

import br.com.washingtonDDS.acesso_api.adapter.input.request.ResidentRequest;
import br.com.washingtonDDS.acesso_api.adapter.input.request.ResidentResponseDto;
import br.com.washingtonDDS.acesso_api.port.input.ResidentInputPort;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/residents")
public class ResidentController {

    private ResidentInputPort residentInputPort;

    public ResidentResponseDto create(@RequestBody ResidentRequest residentRequest) {
        return null;
    }
}
