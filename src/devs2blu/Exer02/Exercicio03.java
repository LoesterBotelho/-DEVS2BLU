/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exer02;

public class Exercicio03 {

	public static void main(String[] args) {

		imprimirAutor();

		// sm = soma
		Double valor1 = 10.0;
		Double valor2 = 10.0;

		Double soma = somar(valor1, valor2);
		Double dobro = dobrar(soma);

		System.out.printf("__________________________________________________________________________________ \n");
		System.out.printf("| Exercício 3 - Soma de dois valores ......: %.2f \n", soma);
		System.out.printf("| Exercício 3 - Seu Dobro .................: %.2f \n", dobro);
		System.out.printf("|_________________________________________________________________________________ \n");
		
	}

	public static Double somar(Double valor1, Double valor2) {
		return (valor1 + valor2);
	}

	public static Double dobrar(Double valor) {
		return (valor * 2);
	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 1 - Loester Franco Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

}
