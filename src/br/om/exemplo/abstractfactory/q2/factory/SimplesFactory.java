package br.om.exemplo.abstractfactory.q2.factory;

import br.om.exemplo.abstractfactory.q2.model.Grafico;
import br.om.exemplo.abstractfactory.q2.model.Relatorio;

public interface SimplesFactory {
    public Relatorio createRelatorio();
    public Grafico createGrafico();
}
