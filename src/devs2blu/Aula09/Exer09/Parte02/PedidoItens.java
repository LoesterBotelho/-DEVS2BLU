package devs2blu.Aula09.Exer09.Parte02;

public class PedidoItens {

	private Produto produto;
	private Double quantidade;
	private Double precoUnitario;
	private Double precoTotal;

	public PedidoItens() {
	}

	public PedidoItens(Produto produto, Double quantidade, Double precoUnitario) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
	}
	
	public PedidoItens(Produto produto, Double quantidade, Double precoUnitario, Double precoTotal) {
		this.produto = produto;
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
		this.precoTotal = precoTotal;
	}
	
	
	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Double quantidade) {
		this.quantidade = quantidade;
	}

	public Double getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(Double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	public Double getPrecoTotal() {
		return precoTotal;
	}

	public void setPrecoTotal(Double precoTotal) {
		this.precoTotal = precoTotal;
	}

	@Override
	public String toString() {
		return "\nPedido [produto=" + produto + ", quantidade=" + quantidade + ", precoUnitario=" + precoUnitario
				+ ", precoTotal=" + precoTotal + "]\n";
	}

}
