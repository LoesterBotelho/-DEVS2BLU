/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exerc04;

import java.util.Random;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		imprimirAutor();

		Integer acertos = 0;
		Integer erros = 0;

		System.out.printf("JOGO : ADIVINHE UM NÚMERO DE 1 A 10. \n");

		Scanner entrada = new Scanner(System.in);

		Integer numDigitado;
		Integer randomNumber;
		Boolean flag = true;

		Random rand = new Random();

		System.out.printf("DIGITE 0 PARA ENCERRAR O PROGRAMA \n", acertos);

		while (flag) {

			randomNumber = rand.nextInt(10) + 1;

			numDigitado = Integer.parseInt(entrada.nextLine());

			if (numDigitado == randomNumber) {
				acertos++;
				System.out.printf("Acertou , sua pontuação é : %d \n", acertos);
			} else {
				erros++;
			}

			if (numDigitado == 0) {
				flag = false;
				break;
			}
		}

		entrada.close();
	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 05 - Loester Botelho - Java \n");
		System.out.printf("............................................ \n");
	}
}
