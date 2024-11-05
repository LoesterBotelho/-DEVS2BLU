package br.com.exemplo.factory.contabil.factory;

import br.com.exemplo.factory.contabil.model.Documento;
import br.com.exemplo.factory.contabil.model.Empenho;

public class EmpenhoFactory extends DocumentoFactory{

	@Override
	public Documento createDocumento() {
		return new Empenho();
	}

}
