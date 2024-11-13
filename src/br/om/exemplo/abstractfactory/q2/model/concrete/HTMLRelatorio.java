package br.om.exemplo.abstractfactory.q2.model.concrete;

import br.om.exemplo.abstractfactory.q2.model.Relatorio;

public class HTMLRelatorio implements Relatorio {

	@Override
	public void gerarRelatorio() {
		System.out.println("GERANDO RELATÓRIO EM HTML");		
	}

}
