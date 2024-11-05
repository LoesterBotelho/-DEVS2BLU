package br.com.exemplo.factory.exercicio02.factory;

import br.com.exemplo.factory.exercicio02.model.Pagamento;
import br.com.exemplo.factory.exercicio02.model.PayPal;

public class PayPalFactory extends PagamentoFactory{

	@Override
	public Pagamento CreatePagamento() {
		return new PayPal();
	}
}
