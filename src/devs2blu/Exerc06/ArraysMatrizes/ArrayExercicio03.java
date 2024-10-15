/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exerc06.ArraysMatrizes;

import java.util.Random;
import java.util.Scanner;

public class ArrayExercicio03 {

	public static void main(String[] args) {

		/***
		 *** Questão 3 - Criar um vetor A com 10 elementos inteiros. Escrever um programa
		 *** que calcule e escreva: a) a soma de elementos armazenados neste vetor que são
		 *** inferiores a 15; b) a quantidade de elementos armazenados no vetor que são
		 *** iguais a 15; c) a média dos elementos armazenados no vetor que são superiores
		 *** a 15.
		 ***/

		imprimirAutor();

		Integer[] vetorEntrada = new Integer[10];

		Scanner entrada = new Scanner(System.in);
		Random aleatorio = new Random();

		System.out.printf("10 NOTAS ALEATÓRIAS \n");

		for (var linha = 0; linha < vetorEntrada.length; linha++) {

			Integer numeroAleatorio = aleatorio.nextInt(37) + 1;
			vetorEntrada[linha] = numeroAleatorio;
			System.out.printf("Nota %d = %d \n", linha + 1, numeroAleatorio);
		}

		// CALCULANDO MEDIA ARITIMETICA SIMPLES

		Integer qtdPessoas35Mais = 0;
		Integer qtdPessoas35Igual = 0;
		Integer qtdPessoas35Menor = 0;

		for (var linha = 0; linha < vetorEntrada.length; linha++) {

			Integer valor = vetorEntrada[linha];

			if (valor > 35) {
				qtdPessoas35Mais++;
			} else if (valor == 35) {
				qtdPessoas35Igual++;
			} else if (valor < 35) {
				qtdPessoas35Menor++;
			}

		}

		System.out.printf("\nO Pessoas maiores que 35 anos ....: %d", qtdPessoas35Mais);
		System.out.printf("\nO Pessoas igual que 35 anos ......: %d", qtdPessoas35Igual);
		System.out.printf("\nO Pessoas menores que 35 anos ....: %d", qtdPessoas35Menor);

		entrada.close();

	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 03 - Loester Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

}
