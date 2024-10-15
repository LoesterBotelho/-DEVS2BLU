/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc09nv2.Pedido;

public class NotaFiscal {

	private Pedido pedido;
	private Endereco endereco;
	
	public NotaFiscal() {

	}

	public NotaFiscal(Pedido pedido, Endereco endereco) {
		this.setPedido(pedido);
		this.setEndereco(endereco);
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public void gerarNotaFiscal() {
		System.out.printf(
				"Nota fiscal gerada para o cliente : %s \n" , 
					this.pedido.getCliente().getNome().toString()
					);
	}

	@Override
	public String toString() {
		return String.format( "NotaFiscal [Cliente=%s, Endereco=%s] \n" , 
				this.getPedido().getCliente().toString(),
				this.getPedido().getEndereco().toString()
				);
	}

	
}
