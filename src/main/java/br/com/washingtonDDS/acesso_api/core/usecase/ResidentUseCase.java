package br.com.washingtonDDS.acesso_api.core.usecase;

import br.com.washingtonDDS.acesso_api.core.domain.model.Resident;
import br.com.washingtonDDS.acesso_api.port.input.ResidentInputPort;
import br.com.washingtonDDS.acesso_api.port.output.ResidentOutputPort;

public class ResidentUseCase implements ResidentInputPort {

    private final ResidentOutputPort residentOutputPort;

    public ResidentUseCase(ResidentOutputPort residentOutputPort) {
        this.residentOutputPort = residentOutputPort;
    }

    @Override
    public Resident create(Resident resident) {
        Resident  residentExist = residentOutputPort.getByCpf(resident.getCpf());
        if (residentExist != null) {
            throw new IllegalArgumentException("Resident with CPF " + resident.getCpf() + " already exists.");
        }
        return residentOutputPort.save(resident);
    }
}
