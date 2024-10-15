/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exer02;

public class Exercicio02 {

	public static void main(String[] args) {

		imprimirAutor();

		// MA = MediaAritimetica
		Double ma1Valor1 = 8.9;
		Double ma1Valor2 = 7.0;
		Double ma2Valor1 = 4.5;
		Double ma2Valor2 = 6.0;

		Double ma1 = calcularMA(ma1Valor1, ma1Valor2);
		Double ma2 = calcularMA(ma2Valor1, ma2Valor2);
		Double media = calcularMA(ma1, ma2);

		System.out.printf("__________________________________________________________________________________ \n");
		System.out.printf("| Exercício 2 - Média dos números %.2f e %.2f ........:  %.2f \n", ma1Valor1, ma1Valor2, ma1);
		System.out.printf("| Exercício 2 - Média dos números %.2f e %.2f ........:  %.2f \n", ma2Valor1, ma2Valor2, ma2);
		System.out.printf("| Exercício 2 - A soma das duas médias ...............: %.2f \n", somar(ma1, ma2));
		System.out.printf("| Exercício 2 - A média das média ....................:  %.2f \n", media);
		System.out.printf("|_________________________________________________________________________________ \n");

	}

	// MA = MediaAritimetica
	public static Double calcularMA(Double valor1, Double valor2) {
		return ((valor1 + valor2) / 2);
	}

	public static Double somar(Double valor1, Double valor2) {
		return (valor1 + valor2);
	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 1 - Loester Franco Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

}
