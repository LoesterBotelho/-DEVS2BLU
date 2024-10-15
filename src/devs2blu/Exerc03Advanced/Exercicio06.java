/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exerc03Advanced;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {

		imprimirAutor();

		Scanner scanner = new Scanner(System.in);

		System.out.printf("Exercício 06 - DIGITE UMA LETRA : \n");
		String valorDigitado = scanner.nextLine();

		valorDigitado = valorDigitado.toLowerCase(); /*** TRANSFORMAR EM LETRA MINUSCULA ***/

		char letra = valorDigitado.charAt(0); /*** PEGAR PRIMEIRA LETRA ***/

		String resultadoVogalOuConsoante = verificarVogalOuConsoante(letra);

		System.out.printf("Exercício 06 - RESULTADO É  : %s \n", resultadoVogalOuConsoante);

		scanner.close();

	}

	public static String verificarVogalOuConsoante(char letra) {

		String resultado = "";

		switch (letra) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			resultado = "VOGAL";
			break;
		default:
			resultado = "CONSOANTE";
		}

		return resultado;

	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 06 - Loester Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

}
