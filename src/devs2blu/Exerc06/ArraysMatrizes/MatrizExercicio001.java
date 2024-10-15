/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exerc06.ArraysMatrizes;

import java.util.Scanner;

public class MatrizExercicio001 {

	public static void main(String[] args) {

		/***
		 *** Questão 1 - Escreva um programa para guardar dados de uma pesquisa feita com
		 *** uma amostra de pessoas da avenida mais movimentada da cidade onde você mora.
		 ***
		 *** A pesquisa consiste em perguntar ao cidadão a quantidade de filhos e o nome
		 *** de cada filho.
		 ***
		 *** Guarde essas informações em uma matriz de forma que cada pessoa entrevistada
		 *** ocupe somente o espaço necessário na memória para guardar os nomes dos
		 *** filhos.
		 *** 
		 *** Imprima a quantidade de pessoas entrevistadas, a quantidade de filhos de cada
		 *** entrevistado e os respectivos nomes dos filhos.
		 ***/

		imprimirAutor();

		Scanner entrada = new Scanner(System.in);

		System.out.printf("QUANTAS ENTREVISTAS FORAM EFETUADAS ? : ");
		int qtdPessoas = Integer.parseInt(entrada.nextLine());

		String[][] dadoPesquisa = new String[qtdPessoas][];

		for (Integer linha = 0; linha < qtdPessoas; linha++) {
			System.out.printf("QUANTOS FILHOS TEM A %d TEM ? : ", linha + 1);
			int qtdFilhos = Integer.parseInt(entrada.nextLine());

			dadoPesquisa[linha] = new String[qtdFilhos];

			for (Integer coluna = 0; coluna < qtdFilhos; coluna++) {
				System.out.printf("DIGITE O NOME DO SEU %dª FILHO : ", coluna + 1);
				dadoPesquisa[linha][coluna] = entrada.nextLine();
			}
		}

		System.out.printf("\nQUANTIDADE DE PESSOAS QUE PARTICIPARAM DA ENTREVISTA : %s \n", qtdPessoas);

		for (Integer linha = 0; linha < dadoPesquisa.length; linha++) {

			System.out.printf("A PESSOA %d TEM %d FILHOS \n", (linha + 1), dadoPesquisa[linha].length);

			for (Integer coluna = 0; coluna < dadoPesquisa[linha].length; coluna++) {

				System.out.printf("  FILHO %d : %s \n", (coluna + 1), dadoPesquisa[linha][coluna]);

			}
		}

		entrada.close();
	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 01 - Loester Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

}