/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exer02;

import java.util.Scanner;

public class Exercicio09 {

	public static void main(String args[]) {

		imprimirAutor();

		Scanner scanner = new Scanner(System.in);

		System.out.printf("Exercício 9 - Digite Valor Exemplo 758.75 \n");
		System.out.printf("Exercício 9 - Digite Valor a ser calculado o desconto : \n");
		Double valor = Double.parseDouble(scanner.nextLine());

		System.out.printf("Exercício 9 - Valor Digitado %.2f \n", valor);

		Double desconto = retornarDesconto(valor);
		Double valorPagar = CalcularDesconto(valor, desconto);

		System.out.printf("Exercício 9 - Valor do desconto %.2f \n", desconto);
		System.out.printf("Exercício 9 - Valor a pagar %.2f \n", valorPagar);

		scanner.close();

	}

	public static Double retornarDesconto(Double valor) {
		return (valor * 0.09); // (9/100) = 0.09
	}

	public static Double CalcularDesconto(Double valor, Double desconto) {
		return (valor - desconto);
	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 1 - Loester Franco Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

}