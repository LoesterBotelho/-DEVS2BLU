package devs2blu.Aula14.Solid1.Exerc01;

import java.util.List;

public class CalculadoraDesconto {

	public double calcularDesconto(Produto produto, Desconto desconto) {
		return desconto.calcularDesconto(produto);
	}

	public double calcularDescontoTotal(List<Produto> produtos, List<Desconto> descontos) {
		double desconto = 0;
		double totalDesconto = 0;
		for (int i = 0; i < produtos.size(); i++) {
			
			System.out.printf("Produto : %s , Preco : %s, "
					, produtos.get(i).getTipoProduto() 
					, produtos.get(i).getPreco()
					);
			
			desconto = descontos.get(i).calcularDesconto(produtos.get(i));
			totalDesconto += desconto;
			
			System.out.printf("Desconto : %s \n"
					, desconto
					);
			
		}
		return totalDesconto;
	}

}
