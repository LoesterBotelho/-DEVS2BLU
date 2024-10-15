package devs2blu.Aula09.Exer09.Parte02;

import java.util.Arrays;

public class Pedido {

	private PedidoItens[] itens;

	public Pedido() {
	}

	public Pedido(PedidoItens[] itens) {
		this.itens = itens;
	}

	public PedidoItens[] getItens() {
		return itens;
	}

	public void setItens(PedidoItens[] itens) {
		this.itens = itens;
	}

	@Override
	public String toString() {
		return "Pedidos [itens=" + Arrays.toString(itens) + "]";
	}

}
