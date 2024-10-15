/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exer02;

import java.util.Scanner;

public class Exercicio05 {

	static final Integer HORA_MINUTOS = 60;
	static final Double VALOR_HORA = 2.30;
	static final Double VALOR_MINUTOS = VALOR_HORA / 60;

	public static void main(String args[]) {

		imprimirAutor();

		Scanner scanner = new Scanner(System.in);

		System.out.printf("Exercício 5 - Exemplo : 800 \n");
		System.out.printf("Exercício 5 - Digite entrada em minutos: \n");
		Integer entradaEmMinutos = Integer.parseInt(scanner.nextLine());

		calcularTempo(entradaEmMinutos);

		Double valorTotal = calcularRecebimento(entradaEmMinutos);

		System.out.printf("Exercício 5 - TOTAL A PAGAR : R$ %.2f \n", valorTotal);

		scanner.close();

	}

	public static Double calcularRecebimento(Integer minutos) {
		return (minutos * VALOR_MINUTOS);
	}

	public static Integer calcularMinutosEmHoras(Integer minutos) {
		return (minutos / HORA_MINUTOS);
	}

	public static Integer calcularHorasEmMinutos(Integer horas) {
		return (horas * HORA_MINUTOS);
	}

	public static void calcularTempo(Integer entradaEmMinutos) {

		Integer horas = calcularMinutosEmHoras(entradaEmMinutos);
		Integer minutos = (entradaEmMinutos - calcularHorasEmMinutos(horas));

		System.out.println("Exercício 5 - TEMPO DE ACESSO : " + horas + " HORA E " + minutos + " MINUTOS");
	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 1 - Loester Franco Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

}