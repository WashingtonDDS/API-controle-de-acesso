package br.com.washingtonDDS.acesso_api.core.usecase;

import br.com.washingtonDDS.acesso_api.core.domain.model.Visitor;
import br.com.washingtonDDS.acesso_api.port.input.VisitorInputPort;
import br.com.washingtonDDS.acesso_api.port.output.VisitorOutputPort;

public class VisitorUseCase implements VisitorInputPort {

    private final VisitorOutputPort visitorOutputPort;

    public VisitorUseCase(VisitorOutputPort visitorOutputPort) {
        this.visitorOutputPort = visitorOutputPort;
    }

    @Override
    public Visitor create(Visitor visitor) {
        return null;
    }
}
