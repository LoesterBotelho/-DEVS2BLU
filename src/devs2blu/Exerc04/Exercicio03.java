/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exerc04;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		imprimirAutor();

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite um número inteiro : ");
		Integer numeroInteiro = Integer.parseInt(entrada.nextLine());

		Boolean retorno = verificarNumeroPrimo(numeroInteiro);

		String retornoString = ((retorno) ? "Resultado é primo" : "Resultado Não É Primo");

		System.out.printf("%s", retornoString);

		entrada.close();
	}

	public static boolean verificarNumeroPrimo(int numero) {

		if (numero < 2) {
			return false;
		}

		/*** Um número natural é primo quando é maior que 1 ***/
		/*** e é divisível apenas por si próprio e por 1. ***/

		Double limite = Math.sqrt(numero);

		for (int i = 2; i <= limite; i++) {
			if (numero % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 03 - Loester Botelho - Java \n");
		System.out.printf("............................................ \n");
	}
}
