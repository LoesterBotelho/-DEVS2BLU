package br.com.exemplo.factory.exercicio02;

import br.com.exemplo.factory.exercicio02.factory.CartaoFactory;
import br.com.exemplo.factory.exercicio02.factory.PagamentoFactory;
import br.com.exemplo.factory.exercicio02.factory.PayPalFactory;
import br.com.exemplo.factory.exercicio02.factory.PixFactory;

public class MainTeste {
	public static void main(String[] args) {
		
		PagamentoFactory pgtoCartao = new CartaoFactory();
		pgtoCartao.processarPagamento();

		PagamentoFactory pgtoPayPal = new PayPalFactory(); 
		pgtoPayPal.processarPagamento();
		
		PagamentoFactory pgtoPix = new PixFactory(); 
		pgtoPix.processarPagamento();
	
		
	}
}
