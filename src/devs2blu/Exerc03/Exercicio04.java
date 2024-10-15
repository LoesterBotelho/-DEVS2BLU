/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exerc03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		imprimirAutor();

		Scanner scanner = new Scanner(System.in);

		System.out.printf("Exercício 04 - SELECIONAR \n");
		System.out.printf("Exercício 04 - DITE UMA DAS OPÇÕES :  \n");
		System.out.printf("Exercício 04 - OPÇÃO : 1 PARA SOMAR \n");
		System.out.printf("Exercício 04 - OPÇÃO : 2 PARA SUBTRAIR \n");
		System.out.printf("Exercício 04 - OPÇÃO : 3 PARA MULTIPLICAR \n");
		System.out.printf("Exercício 04 - OPÇÃO : 4 PARA DIVIDIR \n");
		System.out.printf("------------------------------------- \n");

		System.out.printf("Exercício 04 - DIGITE UMA OPÇÃO : \n");
		Integer opcao = Integer.parseInt(scanner.nextLine());

		System.out.printf("Exercício 04 - INFORME O PRIMEIRO VALOR : \n");
		Double a = Double.parseDouble(scanner.nextLine());

		System.out.printf("Exercício 04 - INFORME O SEGUNDO VALOR : \n");
		Double b = Double.parseDouble(scanner.nextLine());

		switch (opcao) {
		case 1:
			System.out.printf("O RESULTADO DA SOMA É %.2f \n", somar(a, b));
			break;
		case 2:
			System.out.printf("O RESULTADO DA SUBTRAÇÃO É %.2f \n", subtrair(a, b));
			break;
		case 3:
			System.out.printf("O RESULTADO DA MULTIPLICAÇÃO É  %.2f \n ", multiplicar(a, b));
			break;
		case 4:
			System.out.printf("O RESULTADO DA DIVISÃO É  %.2f \n ", dividir(a, b));
			break;
		default:
			System.out.println("opção Invalida");
		}

		scanner.close();

	}

	public static Double somar(Double a, Double b) {
		return (a + b);
	}

	public static Double subtrair(Double a, Double b) {
		return (a - b);
	}

	public static Double multiplicar(Double a, Double b) {
		return (a * b);
	}

	public static Double dividir(Double a, Double b) {
		return (a / b);
	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 4 - Loester Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

}
