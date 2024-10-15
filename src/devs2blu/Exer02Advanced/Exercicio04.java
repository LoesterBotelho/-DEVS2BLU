/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exer02Advanced;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		imprimirAutor();

		Scanner scanner = new Scanner(System.in);

		System.out.printf("Exercício 02 - Informe a velocidade em km | exemplo : 40  : \n");
		Double velocidade = Double.parseDouble(scanner.nextLine());

		Double DistanciacincoHoras = calcularComissao(velocidade, 5.0);
		Double DistanciaoitoHoras = calcularComissao(velocidade, 8.0);
		Double DistanciadozeHoras = calcularComissao(velocidade, 12.0);

		System.out.printf("Exercício 04 - A distância que o carro percorrerá em 5 horas %.0f km \n", DistanciacincoHoras);
		System.out.printf("Exercício 04 - A distância que o carro percorre em 8 horas %.0f km \n", DistanciaoitoHoras);
		System.out.printf("Exercício 04 - A distância que o carro percorrerá em 12 horas %.0f km \n", DistanciadozeHoras);

		scanner.close();

	}

	public static Double calcularComissao(Double velocidade, Double tempoHoras) {

		return (velocidade * tempoHoras);
	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 4 - Loester Franco Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

}
