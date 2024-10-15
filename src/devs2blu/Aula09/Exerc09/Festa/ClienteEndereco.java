/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc09.Festa;

public class ClienteEndereco {

	Cliente cliente = new Cliente();
	String enderecoCompleto = "";

	ClienteEndereco() {
		this.setCliente(new Cliente());
		this.setEnderecoCompleto("");
	}

	ClienteEndereco(Cliente cliente, String enderecoCompleto) {		
		this.setCliente(cliente);
		this.setEnderecoCompleto(enderecoCompleto);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getEnderecoCompleto() {
		return enderecoCompleto;
	}

	public void setEnderecoCompleto(String enderecoCompleto) {
		this.enderecoCompleto = enderecoCompleto;
	}

	@Override
	public String toString() {

		String msg = "Endereço Completo ...........................: %s \n";

		System.out.printf(msg, this.enderecoCompleto);

		String msgFormatada = String.format(msg, this.enderecoCompleto);

		return msgFormatada;

	}
}
