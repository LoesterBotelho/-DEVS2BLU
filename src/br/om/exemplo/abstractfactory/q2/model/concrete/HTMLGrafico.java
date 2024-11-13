package br.om.exemplo.abstractfactory.q2.model.concrete;

import br.om.exemplo.abstractfactory.q2.model.Grafico;

public class HTMLGrafico implements Grafico{

	@Override
	public void gerarGrafico() {
		System.out.println("GERANDO GRÁFICO EM HTML");
	}

}
