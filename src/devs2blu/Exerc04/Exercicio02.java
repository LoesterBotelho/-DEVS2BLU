/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exerc04;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		imprimirAutor();

		final Integer LIMITE_INFERIOR = 3;
		final Integer LIMITE_SUPERIOR = 12;

		Scanner entrada = new Scanner(System.in);

		Double soma = 0.0;
		
		for (int i = LIMITE_INFERIOR; i < LIMITE_SUPERIOR; i += 1) {

			Boolean ehPar = (i % 2) == 0;
			
			if (ehPar != true) {
				continue;
			}

			soma += i;
			System.out.printf("%d " , i);

		}

		System.out.printf("\nO RESULTADO DA SOMA É %.2f \n" , soma);
		
		// Saída: 4 6 8 10
		// Soma: 28

		entrada.close();

	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 02 - Loester Botelho - Java \n");
		System.out.printf("............................................ \n");
	}
}
