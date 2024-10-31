package devs2blu.Aula14.Solid1.Exerc01;

public class DescontoAlimento implements Desconto {

	public double calcularDesconto(Produto produto) {
		return produto.getPreco() * 0.05;
	}
}
