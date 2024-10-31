package devs2blu.Aula14.Solid2.Exerc02;

public class CartaoDeCredito implements Pagamento{

	@Override
	public void processarPagamento() {
		System.out.println("Processamento de Pagamento : CartaoDeCredito.");
	}

}
