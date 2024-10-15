/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exer02Advanced;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		imprimirAutor();

		// https://escolakids.uol.com.br/matematica/quadrados.htm
		
		Scanner scanner = new Scanner(System.in);

		System.out.printf("Exercício 02 - Informe um lado do quadrado  : \n");		
		Double ladoQuadrado = Double.parseDouble(scanner.nextLine());

		Double areaQuadrado = calcularAreaQuadrado(ladoQuadrado);
		Double PerimetroQuadrado = calcularPerimetroQuadrado(ladoQuadrado);
		
		System.out.printf("Exercício 2 - AREA DO QUADRADO : %.2f \n", areaQuadrado);
		System.out.printf("Exercício 2 - PERIMETRO DO QUADRADO: %.2f \n", PerimetroQuadrado);
		
		scanner.close();

	}

	public static Double calcularAreaQuadrado(Double lado) {

		return (lado * lado);
	}

	public static Double calcularPerimetroQuadrado(Double lado) {

		return (lado + lado + lado + lado);
	}

	
	public static void imprimirAutor() {
		System.out.printf("Exercício 2 - Loester Franco Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

}
