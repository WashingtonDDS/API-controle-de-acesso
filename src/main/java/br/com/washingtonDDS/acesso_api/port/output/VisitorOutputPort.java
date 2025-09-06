package br.com.washingtonDDS.acesso_api.port.output;

import br.com.washingtonDDS.acesso_api.core.domain.model.Visitor;

public interface VisitorOutputPort {

    public Visitor save(Visitor visitor);

    public Visitor getByRg(String rg);
}
