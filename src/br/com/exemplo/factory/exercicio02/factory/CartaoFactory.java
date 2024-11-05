package br.com.exemplo.factory.exercicio02.factory;

import br.com.exemplo.factory.exercicio02.model.Cartao;
import br.com.exemplo.factory.exercicio02.model.Pagamento;

public class CartaoFactory extends PagamentoFactory{
	
	@Override
	public Pagamento CreatePagamento() {
		return new Cartao();
	}

}
