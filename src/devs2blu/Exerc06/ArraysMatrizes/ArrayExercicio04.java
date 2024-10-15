/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exerc06.ArraysMatrizes;

import java.util.Scanner;

public class ArrayExercicio04 {

	public static void main(String[] args) {

		/***
		 *** Questão 4 – Escreva um programa que receba o nome de cinco clientes e
		 * armazene-os em um vetor.
		 *** 
		 *** Em um segundo vetor, armazene a quantidade de DVDs locados em 2022 por cada
		 * um dos cinco clientes. Sabe-se que,
		 ***
		 *** para cada dez locações, o cliente tem direito a uma locação grátis. O
		 * programa deverá mostrar todos os nomes dos clientes com a quantidade de
		 * locação grátis que ele tem direito.
		 ***/

		imprimirAutor();

		Integer tamanho = 5;

		String[] vetorEntradaNome = new String[tamanho];
		Integer[] vetorEntradaLocacoes = new Integer[tamanho];
		Integer[] vetorSaldoBonusLocacoes = new Integer[tamanho];
		Integer calc = 0;

		Scanner entrada = new Scanner(System.in);

		for (var linha = 0; linha < vetorEntradaNome.length; linha++) {

			System.out.printf("DIGITE O NOME DO %d CLIENTE : \n", linha + 1);
			vetorEntradaNome[linha] = entrada.nextLine();

			System.out.printf("DIGITE O NUMERO DE LOCAÇÕES QUE O CLIENTE %s CLIENTE FEZ : \n", vetorEntradaNome[linha]);
			vetorEntradaLocacoes[linha] = Integer.parseInt(entrada.nextLine());

			calc = vetorEntradaLocacoes[linha] / 10;

			if (calc > 0) {
				vetorSaldoBonusLocacoes[linha] = calc;
			} else {
				vetorSaldoBonusLocacoes[linha] = 0;
			}

		}

		for (var linha = 0; linha < vetorEntradaNome.length; linha++) {

			System.out.printf("O CLIENTE %s TEM DIREITO %d LOCAÇÕES GRATUITAS. \n", vetorEntradaNome[linha],
					vetorSaldoBonusLocacoes[linha]);
		}

		entrada.close();

	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 04 - Loester Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

}
