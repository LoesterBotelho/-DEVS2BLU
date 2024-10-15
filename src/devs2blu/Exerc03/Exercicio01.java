/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exerc03;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		imprimirAutor();

		Scanner scanner = new Scanner(System.in);

		System.out.printf("Exercício 01 - Informe o valor de um inteiro , positivo : \n");
		Integer valorInteiroPositivo = Integer.parseInt(scanner.nextLine());

		if (valorInteiroPositivo <= 0) {
			System.out.printf("Exercício 01 - ATENÇÃO , NÃO FOI DIGITADO UM INTEIRO POSITIVO ! \n");
		} else {

			String ehPar = (((valorInteiroPositivo % 2) == 0) ? "PAR" : "IMPAR");

			System.out.printf("Exercício 01 - O VALOR É %s.", ehPar);
		}

		scanner.close();

	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 01 - Loester Franco Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

}
