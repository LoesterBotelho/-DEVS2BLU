package br.om.exemplo.abstractfactory.q2.factory;

import br.om.exemplo.abstractfactory.q2.model.Grafico;
import br.om.exemplo.abstractfactory.q2.model.Relatorio;
import br.om.exemplo.abstractfactory.q2.model.concrete.HTMLGrafico;
import br.om.exemplo.abstractfactory.q2.model.concrete.HTMLRelatorio;

public class HTMLFactory implements SimplesFactory {

	@Override
	public Relatorio createRelatorio() {
		return new HTMLRelatorio();
	}

	@Override
	public Grafico createGrafico() {
		return new HTMLGrafico();
	}

}