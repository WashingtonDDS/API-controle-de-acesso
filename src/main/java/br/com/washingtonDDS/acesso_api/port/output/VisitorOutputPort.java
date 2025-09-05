package br.com.washingtonDDS.acesso_api.port.output;

import br.com.washingtonDDS.acesso_api.core.domain.model.Visitor;

public interface VisitorOutputPort {

    Visitor save(Visitor visitor);
}
