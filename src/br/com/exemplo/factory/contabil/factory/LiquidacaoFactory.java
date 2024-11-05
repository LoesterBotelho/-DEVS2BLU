package br.com.exemplo.factory.contabil.factory;

import br.com.exemplo.factory.contabil.model.Documento;
import br.com.exemplo.factory.contabil.model.Liquidacao;

public class LiquidacaoFactory extends DocumentoFactory{

	@Override
	public Documento createDocumento() {
		return new Liquidacao();
	}

}
