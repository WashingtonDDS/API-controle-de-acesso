package br.com.washingtonDDS.acesso_api.core.usecase;

import br.com.washingtonDDS.acesso_api.core.domain.model.Resident;
import br.com.washingtonDDS.acesso_api.port.input.ResidentInputPort;
import br.com.washingtonDDS.acesso_api.port.output.ResidentOutputPort;

public class ResidentUseCase implements ResidentInputPort {

    private final ResidentOutputPort residentOutputPort;

    public ResidentUseCase(ResidentOutputPort userOutputPort) {
        this.residentOutputPort = residentOutputPort;
    }

    @Override
    public Resident create(Resident Resident) {

        return residentOutputPort.save(Resident);
    }
}
