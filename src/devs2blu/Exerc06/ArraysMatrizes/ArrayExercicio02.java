/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exerc06.ArraysMatrizes;

import java.util.Random;
import java.util.Scanner;

public class ArrayExercicio02 {

	public static void main(String[] args) {

		/***
		 *** Questão 2 - Ler um vetor A com 10 elementos inteiros correspondentes as
		 *** idades de um grupo de pessoas. Escreva um programa que determine e escreva a
		 *** quantidade de pessoas que possuem idade superior a 35 anos.
		 ***/

		imprimirAutor();

		Integer[] vetorEntrada = new Integer[10];

		Scanner entrada = new Scanner(System.in);
		Random aleatorio = new Random();

		System.out.printf("10 NOTAS ALEATÓRIAS \n");

		for (var linha = 0; linha < vetorEntrada.length; linha++) {

			Integer numeroAleatorio = aleatorio.nextInt(100) + 1;
			vetorEntrada[linha] = numeroAleatorio;
			System.out.printf("Pessoa %s com idade de : %s \n", completarZeroaEsquerda(linha + 1, 3), completarZeroaEsquerda(numeroAleatorio,3));
		}

		Integer qtdPessoas35Mais = 0;
		Integer qtdPessoas35MenosIgual = 0;

		for (var linha = 0; linha < vetorEntrada.length; linha++) {

			Integer valor = vetorEntrada[linha];

			if (valor > 35) {
				qtdPessoas35Mais++;
			} else {
				qtdPessoas35MenosIgual++;
			}
		}

		System.out.printf("\nO Pessoas maiores que maiores 35 anos ..............: %s",
				completarZeroaEsquerda(qtdPessoas35Mais, 3));
		System.out.printf("\nO Pessoas maiores que menores ou igual a 35 anos ...: %s",
				completarZeroaEsquerda(qtdPessoas35MenosIgual, 3));

		entrada.close();

	}

	public static Boolean ehPar(Integer valor) {
		Boolean Resultado = false;

		if ((valor > 2) && ((valor % 2) == 0)) {
			Resultado = true;
		}

		return Resultado;
	}

	public static String completarZeroaEsquerda(Integer valor, Integer qtdZeros) {

		String valorString = valor.toString();
		Integer tamanho = valorString.length();
		Integer calcularTamanho = (qtdZeros - tamanho);

		StringBuilder pattern = new StringBuilder();

		for (int i = 0; i < calcularTamanho; i++) {
			pattern.append("0");
		}
		pattern.append(valorString);

		return pattern.toString();
	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 02 - Loester Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

}
