package br.com.washingtonDDS.acesso_api.port.input;

import br.com.washingtonDDS.acesso_api.core.domain.model.Visitor;

public interface VisitorInputPort {
    public Visitor create(Visitor visitor);


}
