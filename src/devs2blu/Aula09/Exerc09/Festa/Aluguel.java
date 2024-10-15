/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc09.Festa;

public class Aluguel {

	private Cliente cliente = new Cliente();
	private ClienteEndereco clienteEndereco = new ClienteEndereco();
	private Tema tema = new Tema();
	private Festa festa = new Festa();
	

	Aluguel() {
		this.setCliente(new Cliente());
		this.setClienteEndereco(new ClienteEndereco());
		this.setTema(new Tema());
		this.setFesta(new Festa());
	}

	Aluguel(Cliente cliente, ClienteEndereco clienteEndereco, Tema tema, Festa festa) {
		this.setCliente(cliente);
		this.setClienteEndereco(clienteEndereco);
		this.setTema(tema);
		this.setFesta(festa);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public ClienteEndereco getClienteEndereco() {
		return clienteEndereco;
	}

	public void setClienteEndereco(ClienteEndereco clienteEndereco) {
		this.clienteEndereco = clienteEndereco;
	}

	public Tema getTema() {
		return tema;
	}

	public void setTema(Tema tema) {
		this.tema = tema;
	}

	public Festa getFesta() {
		return festa;
	}

	public void setFesta(Festa festa) {
		this.festa = festa;
	}
	
	@Override
	public String toString() {

		String msg = "%s%s%s%s"
				+ "Desconto ....................................: %.2f \n"
				+ "Cobrar o valor ..............................: %.2f";
				
		String msgFormatada = String.format(msg, 
				this.cliente.toString(),
				this.clienteEndereco.toString(),
				this.tema.toString(),
				this.festa.toString(),				
				this.festa.getDesconto(), 
				this.festa.getValorCobrado()
				);
			
		return msgFormatada;

	}

	// Metodos implementados Loester
	
	public void metodoContabilizarPagamento(Double valorPago) {

		this.metodoAplicarDescontoCliente();
		
		System.out.println( this.toString() );	

		if (valorPago < this.festa.getValorCobrado()) {
			System.out.printf(
					"ERROR .......................................: "
				  + "Valor Insuficiente - Pagamento não efetuado ! \n");
		}

		if (valorPago >= this.festa.getValorCobrado()) {
			this.festa.setValorPago(this.festa.getValorCobrado());

			Double troco = valorPago - this.festa.getValorCobrado();

			System.out.printf(
					  "Valor pago de "
					+ "...............................: %.2f \n", 
					valorPago);

			if (troco > 0) {
				System.out.printf(
						  "Devolver o Troco de "
						+ ".........................: %.2f \n", 
						troco);
			}

			this.cliente.getSaldo().setCliente(cliente);
			this.cliente.getSaldo().setSaldoAnterior(festa.getValorPago());

			System.out.printf(
					  "OPERAÇÃO "
					+ "....................................: "
					+ "Pagamento Efetuado Com Sucesso ! \n");
			
			System.out.printf(
					  "LOCAÇÕES ATUAIS PAGAS "
					+ ".......................: %.2f \n\n\n",
					this.cliente.getSaldo().getSaldoAnterior());

		}

	}

	private void metodoAplicarDescontoCliente() {

		Double descontoAplicado = 0.1; /// (10/100)=0.1; /// 1%

		Double locacoesMinimaDesconto = (Double) 1000.0;

		Double locacoesAtuais = this.cliente.getSaldo().getSaldoAnterior();		

		/***
		 *** 0: if d1 is numerically equal to d2. 
		 *** Negative value: if d1 is numerically less than d2. 
		 *** Positive value: if d1 is numerically greater than d2.
		 ***/
		
		Boolean flag = Double.compare(locacoesAtuais, locacoesMinimaDesconto) > 0;

		/// System.out.printf("OK - %.2f - %.2f = %s \n\n\n", locacoesAtuais,locacoesMinimaDesconto, flag);

		if (flag) {
			this.festa.setDesconto(this.tema.getPrecoTema() * descontoAplicado);
		} else {
			this.festa.setDesconto(0.0);
		}

		this.festa.setValorCobrado(this.tema.getPrecoTema() - this.festa.getDesconto());
	}
	
}
