/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exer02;

import java.util.Scanner;

public class Exercicio08 {

	public static void main(String args[]) {

		imprimirAutor();

		Scanner scanner = new Scanner(System.in);

		System.out.printf("Exercício 8 - Informe uma quantidade de horas \n");
		System.out.printf("Exercício 8 - Exemplo : 8 \n");
		System.out.printf("Exercício 8 - Digite um quantidade em horas : \n");
		Integer horas = Integer.parseInt(scanner.nextLine());

		Integer minutos = calcularMinutos(horas);
		Integer segundos = CalcularSegundos(horas);

		System.out.printf("Exercício 8 - Tantas %d Horas Em Minutos : %d \n", horas, minutos);
		System.out.printf("Exercício 8 - Tantas %d Horas Em Minutos : %d \n", horas, segundos);

		scanner.close();

	}

	public static Integer calcularMinutos(Integer horas) {
		return (horas * 60);
	}

	public static Integer CalcularSegundos(Integer horas) {
		return (horas * (60 * 60)); // 1 hora tem 60 minutos e 1 minuto tem 60 segundos.
	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 1 - Loester Franco Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

}