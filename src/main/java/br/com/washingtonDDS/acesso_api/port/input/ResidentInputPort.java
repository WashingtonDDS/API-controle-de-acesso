package br.com.washingtonDDS.acesso_api.port.input;

import br.com.washingtonDDS.acesso_api.core.domain.model.Resident;


public interface ResidentInputPort {
    public Resident create(Resident Resident);
}
