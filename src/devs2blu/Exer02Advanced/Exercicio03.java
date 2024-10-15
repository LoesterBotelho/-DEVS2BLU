/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exer02Advanced;

public class Exercicio03 {

	public static void main(String[] args) {

		imprimirAutor();

		Double acoesCompradas = 1000.0;
		Double precoAcaoCompra = 32.87;
		Double precoAcaoVenda = 33.92;
		Double taxaCorretagemCompra = 0.02; // (2/100) = 0,02 // 2%
		Double taxaCorretagemVenda = 0.02; // (2/100) = 0,02 // 2%
		// duas semanas depois foi vendida

		// 1000 * 32.87 = 32.870
		Double valorPagoCompraLiquido = calcularAcoes(acoesCompradas, precoAcaoCompra);
		
		// 1000 * 33.92 = 33.920
		Double valorPagoVendaLiquido = calcularAcoes(acoesCompradas, precoAcaoVenda);

		// 32.870 * 0.02 = 657,40
		Double valorCorretagemCompra = calcularComissao(valorPagoCompraLiquido, taxaCorretagemCompra);
		
		// 33.920 * 0.02 = 678,40
		Double valorCorretagemVenda = calcularComissao(valorPagoVendaLiquido, taxaCorretagemVenda);

		// 32.870 + 657,40 = 33.527,40
		//Double valorPagoCompraBruto = valorPagoCompraLiquido + valorCorretagemCompra;
		
		// 33.920 + 678,40 = 34.598,40
		//Double valorPagoVendaBruto = valorPagoVendaLiquido + valorCorretagemVenda;

		// 33.920 - 32.870 = 1050.00
		Double lucroOuPrejuizoLiquido = calcularLucroPrejuizo(valorPagoCompraLiquido, valorPagoVendaLiquido);
		
		//  34.598,40 - 33.527,40 = 1071.00 
		//Double lucroOuPrejuizoBruto = calcularLucroPrejuizo(valorPagoCompraBruto, valorPagoVendaBruto);

		// 657,40 + 678,40 = 1.335,80
		Double valorTotalCorretagem = valorCorretagemCompra + valorCorretagemVenda;

		System.out.printf("Exercício 03 - a. A quantia paga pelas ações ..........: %.2f \n", valorPagoCompraLiquido);
		System.out.printf("Exercício 03 - b. O valor da comissão que corretor ....:   %.2f \n", valorCorretagemCompra);
		System.out.printf("Exercício 03 - c. A quantia pela vendeu as ações ......: %.2f \n", valorPagoVendaLiquido);
		System.out.printf("Exercício 03 - d. A quantia de comissão corretor ......:   %.2f \n", valorCorretagemVenda);
		System.out.printf("Exercício 03 - e. Mostre a quantia que ganhou .........:  %.2f \n", lucroOuPrejuizoLiquido);

		System.out.printf("----------------------------------------------------  \n");
		System.out.printf("OBS.: * VALOR TOTAL DA CORRETAGEM: %.2f \n", valorTotalCorretagem);

	}

	public static Double calcularComissao(Double valor, Double taxa) {
		return (valor * taxa);
	}

	public static Double calcularAcoes(Double valorPago, Double qtd) {
		return (valorPago * qtd);
	}

	public static Double calcularLucroPrejuizo(Double valorCompra, Double valorVenda) {
		return (valorVenda - valorCompra);
	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 3 - Loester Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

}
