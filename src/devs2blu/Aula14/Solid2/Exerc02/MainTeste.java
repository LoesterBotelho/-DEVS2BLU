package devs2blu.Aula14.Solid2.Exerc02;

public class MainTeste {
	public static void main(String[] args) {
		
		Pagamento pgtoCartaoDeCredito = new CartaoDeCredito();
		Pagamento pgtoPayPal = new PayPal();
		Pagamento pgtoBitCoin = new Bitcoin();
				
		pgtoCartaoDeCredito.processarPagamento();
		
		pgtoPayPal.processarPagamento();
		
		pgtoBitCoin.processarPagamento();
	}
}
