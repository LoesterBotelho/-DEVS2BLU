package br.com.exemplo.factory.exercicio02.factory;

import br.com.exemplo.factory.exercicio02.model.Pagamento;
import br.com.exemplo.factory.exercicio02.model.Pix;

public class PixFactory extends PagamentoFactory{

	@Override
	public Pagamento CreatePagamento() {
		return new Pix();
	}

}
