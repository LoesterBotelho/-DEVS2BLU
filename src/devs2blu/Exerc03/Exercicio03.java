/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exerc03;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		imprimirAutor();

		Scanner scanner = new Scanner(System.in);

		final Integer CAIXA_LARANJA = 60;
		final Integer CAIXA_LIMAO = 80;
		final Integer CAIXA_MORANGO = 20;

		System.out.printf("Exercício 03 - SELECIONAR \n");
		System.out.printf("Exercício 03 - DITE UMA DAS OPÇÕES :  \n");
		System.out.printf("Exercício 03 - OPÇÃO : 1 PARA LARANJA \n");
		System.out.printf("Exercício 03 - OPÇÃO : 2 PARA LIMÃO \n");
		System.out.printf("Exercício 03 - OPÇÃO : 3 PARA MORANGO \n");
		System.out.printf("------------------------------------- \n");

		System.out.printf("Exercício 03 - DIGITE UMA OPÇÃO : \n");
		Integer opcao = Integer.parseInt(scanner.nextLine());

		System.out.printf("Exercício 03 - INFORME O PREÇO UNITÁRIO : \n");
		Double precoUnitario = Double.parseDouble(scanner.nextLine());

		switch (opcao) {
		case 1:
			System.out.printf("A CAIXA DE LARANJA O PREÇO É %.2f \n", precoUnitario * CAIXA_LARANJA);
			break;
		case 2:
			System.out.printf("A CAIXA DE LIMÃO O PREÇO É %.2f \n", precoUnitario * CAIXA_LIMAO);
			break;
		case 3:
			System.out.printf("A CAIXA DE MORANGO O PREÇO É %.2f \n ", precoUnitario * CAIXA_MORANGO);
			break;
		default:
			System.out.println("Invalido");
		}

		scanner.close();

	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 03 - Loester Franco Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

}
