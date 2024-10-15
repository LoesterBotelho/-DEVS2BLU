/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc09nv2.Pedido;

class Pedido {
	private Cliente cliente;
	private Double valorTotal;
	private Endereco endereco;

	public Pedido() {
		this.setCliente(new Cliente());
		this.setValorTotal(0.0);
	}

	public Pedido(Cliente cliente, Endereco endereco, Double valorTotal) {
		this.setCliente(cliente);
		this.setValorTotal(valorTotal);
		this.setEndereco(endereco);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public String getValorTotalString() {
		return String.valueOf(valorTotal);
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return String.format(
				"Pedido [cliente=%s, valorTotal=%s, endereco=%s]", 
				this.getCliente().toString(),
				this.getValorTotalString(), 
				this.getEndereco().getEndereco().toString());

	}

	public void enviarPedido() {
		System.out.printf("Pedido enviado para: %s \n", this.getEndereco().getEndereco().toString());
	}

}