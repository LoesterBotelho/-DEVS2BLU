package devs2blu.Aula09.Exerc09nv2.Pedido;

public class Endereco {

	private Cliente cliente;
	private String endereco;

	public Endereco() {
		this.setCliente(new Cliente());
		this.setEndereco("");
	}

	public Endereco(Cliente cliente, String endereco) {
		this.setCliente(cliente);
		this.setEndereco(endereco);
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {

		return String.format("Endereco [cliente=%s, endereco=%s]", this.getCliente().getNome().toString(),
				this.getEndereco());
	}

}
