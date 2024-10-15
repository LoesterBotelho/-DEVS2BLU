/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exerc03Advanced;

public class Exercicio01 {

	// static Double valorDoTroco = 0.0;

	public static void main(String[] args) {

		imprimirAutor();

		final Double MOEDA_1_REAL = 1.0;
		final Double MOEDA_10_REAL = 10.0;
		final Double MOEDA_100_REAL = 100.0;

		Double valorDaCompra = 725.0;
		Double valorDoPagamento = 1000.0;

		// 1000 - 725 = 275
		Double valorDoTroco = (valorDoPagamento - valorDaCompra);
		Double valorDoResto = valorDoTroco;

		/*
		 * EXPLICAÇÃO : LO
		 * https://www.universidadejava.com.br/materiais/java-operadores-atribuicao
		 * Símbolo %= é utilizado para atribuir a uma variável O valor do resto da
		 * divisão desta variável por um operando.
		 */

		System.out.printf("CALC 0 - TROCO : %.2f \n", valorDoResto);
		
		Double qtdDeNotasDe100 = (valorDoResto - (valorDoResto %= MOEDA_100_REAL)) / MOEDA_100_REAL;

		System.out.printf("CALC 1 - RESTO :  %.2f \n", valorDoResto);

		Double qtdDeNotasDe10 = (valorDoResto - (valorDoResto %= MOEDA_10_REAL)) / MOEDA_10_REAL;

		System.out.printf("CALC 2 - RESTO :   %.2f \n", valorDoResto);

		Double qtdDeNotasDe1 = (valorDoResto - (valorDoResto %= MOEDA_1_REAL)) / MOEDA_10_REAL;

		System.out.printf("CALC 3 - RESTO :   %.2f \n", (valorDoResto));

		System.out.printf("------------------------------------------------ \n", qtdDeNotasDe100);

		System.out.printf("Exercício 01 - QTD DE NOTAS DE 100 ......:  %.0f \n", qtdDeNotasDe100);
		System.out.printf("Exercício 01 - QTD DE NOTAS DE 10 .......:  %.0f  \n", qtdDeNotasDe10);
		System.out.printf("Exercício 01 - QTD DE NOTAS DE 1 ........:  %.0f  \n", qtdDeNotasDe1);

	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 01 - Loester Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

}
