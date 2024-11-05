package br.com.exemplo.factory.exercicio02.factory;

import br.com.exemplo.factory.exercicio02.model.Pagamento;

public abstract class PagamentoFactory {
	
	public abstract Pagamento CreatePagamento();

	public void processarPagamento() {
		Pagamento pagamento = CreatePagamento();
		pagamento.processarPagamento();
	}
}
