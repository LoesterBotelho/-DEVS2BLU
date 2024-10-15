/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exerc06.ArraysMatrizes;

import java.util.Random;
import java.util.Scanner;

public class ArrayExercicio01 {

	public static void main(String[] args) {

		/***
		 *** Questão 1 - Criar um vetor A com 10 elementos inteiros. Implementar um
		 *** programa que defina e escreva a média aritmética simples dos elementos
		 *** ímpares armazenados neste vetor.
		 ***/

		imprimirAutor();

		Integer[] vetorEntrada = new Integer[10];

		Scanner entrada = new Scanner(System.in);
		Random aleatorio = new Random();

		System.out.printf("10 NOTAS ALEATÓRIAS \n");

		for (var linha = 0; linha < vetorEntrada.length; linha++) {

			Integer numeroAleatorio = aleatorio.nextInt(10) + 1;
			vetorEntrada[linha] = numeroAleatorio;
			System.out.printf("Nota %d = %d \n", linha + 1, numeroAleatorio);
		}

		// CALCULANDO MEDIA ARITIMETICA SIMPLES

		Integer qtdPar = 0;
		Integer qtdImpar = 0;
		Integer somaPar = 0;
		Integer somaImpar = 0;
		Integer mediaAritimeticaSimplesPar = 0;
		Integer mediaAritimeticaSimplesImpar = 0;

		for (var linha = 0; linha < vetorEntrada.length; linha++) {

			Integer valor = vetorEntrada[linha];

			if (ehPar(valor)) {
				qtdPar++;
				somaPar += valor;
			} else {
				qtdImpar++;
				somaImpar += valor;
			}
		}

		mediaAritimeticaSimplesPar = (somaPar / qtdPar);
		mediaAritimeticaSimplesImpar = (somaImpar / qtdImpar);

		Integer mediaAritimeticaSimples = ((somaPar + somaImpar) / (qtdPar + qtdImpar));

		System.out.printf("\nO Resultado da média aritimética dos Números Pares é %d", mediaAritimeticaSimplesImpar);
		System.out.printf("\nO Resultado da média aritimética dos Números Impares é %d", mediaAritimeticaSimplesPar);

		System.out.printf("\nO Resultado da média aritimética de todos é %d", mediaAritimeticaSimples);

		entrada.close();

	}

	public static Boolean ehPar(Integer valor) {
		Boolean Resultado = false;

		if ((valor > 2) && ((valor % 2) == 0)) {
			Resultado = true;
		}

		//// String ehPar = ((Resultado) ? "PAR" : "IMPAR");
		//// System.out.printf(" %.2f é %s\n", valor, ehPar);

		return Resultado;
	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 01 - Loester Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

}
