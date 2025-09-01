package br.com.washingtonDDS.acesso_api.port.output;

import br.com.washingtonDDS.acesso_api.core.domain.model.Resident;

public interface ResidentOutputPort {
    public Resident save(Resident resident);
    public  Resident getByCpf(String cpf);
}
