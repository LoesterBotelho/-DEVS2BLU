package devs2blu.Aula13.Exerc01;

public class MainTeste {
	public static void main(String[] args) {

		Pagamento pgtoCartao = new PagamentoCartao();
		pgtoCartao.processarPagamento();
		
		Pagamento pgtoPix = new PagamentoPix(); 
		pgtoPix.processarPagamento();
		
	}
}
