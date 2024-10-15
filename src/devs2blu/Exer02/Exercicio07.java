/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exer02;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String args[]) {

		imprimirAutor();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Exercício 7 - Digite um Nome : ");
		String nome = scanner.nextLine();

		System.out.println("Exercício 7 - Digite uma idade : ");
		Integer idade = Integer.parseInt(scanner.nextLine());

		Integer dias = calcularDiasVividos(idade);

		System.out.printf("Exercício 7 - %s Já viveu %d dias. \n", nome, dias);

		scanner.close();

	}

	public static Integer calcularDiasVividos(Integer idade) {
		// como não foi pedido , não foi considerado ano bisexto
		return (idade * 365);
	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 1 - Loester Franco Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

}