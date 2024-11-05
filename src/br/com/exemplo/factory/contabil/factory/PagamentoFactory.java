package br.com.exemplo.factory.contabil.factory;

import br.com.exemplo.factory.contabil.model.Documento;
import br.com.exemplo.factory.contabil.model.Pagamento;

public class PagamentoFactory extends DocumentoFactory{

	@Override
	public Documento createDocumento() {
		return new Pagamento();
	}

}
