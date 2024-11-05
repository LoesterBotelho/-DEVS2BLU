package br.com.exemplo.factory.exercicio02.model;

public class Cartao implements Pagamento{
	@Override
	public void processarPagamento() {
		System.out.println("PROCESSAMENTO DE PAGAMENTO : Cartao ");
	}
}
