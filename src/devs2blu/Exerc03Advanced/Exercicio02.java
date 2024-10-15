/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exerc03Advanced;

import java.util.Scanner;

public class Exercicio02 {
	private static Scanner scanner;

	public static void main(String[] args) {

		imprimirAutor();

		scanner = new Scanner(System.in);

		String[] nomeVariavelEntrada = { "NOTA 1", "NOTA 2", "NOTA 3" };
		Double[] valores = new Double[3];

		Integer i = 0;

		for (i = 0; i <= 2; i++) {

			System.out.printf("Exercício 02 - Digite a %s : \n", nomeVariavelEntrada[i]);
			valores[i] = Double.parseDouble(scanner.nextLine());
		}

		/* TRANSFORMANDO VALORES DE VETOR EM VÁRIAVEL */
		Double nota1 = valores[0];
		Double nota2 = valores[1];
		Double nota3 = valores[2];

		Double mediaFinal = calcularMediaFinal(nota1, nota2, nota3);

		String notaTexto = verificarNotaTexto(mediaFinal);

		System.out.printf("Exercício 02 - o valor da média final é %.02f \n", mediaFinal);
		System.out.printf("Exercício 02 - o valor da nota final em TEXTO é %s \n", notaTexto);

		scanner.close();

	}

	public static Double calcularMediaFinal(Double nota1, Double nota2, Double nota3) {

		Double mediaAritimeticaExercicio = (nota1 + nota2 + nota3) / 3;

		Double peso1 = 1.0;
		Double peso2 = 2.0;
		Double peso3 = 3.0;
		Double pesoMediaAritimetica = 1.0;
		Double pesoTotal = peso1 + peso2 + peso3 + pesoMediaAritimetica; // 7

		Double ponderamentoPesoNota1 = nota1 * peso1;
		Double ponderamentoPesoNota2 = nota2 * peso2;
		Double ponderamentoPesoNota3 = nota3 * peso3;

		Double mediaFinal = (((ponderamentoPesoNota1 + ponderamentoPesoNota2 + ponderamentoPesoNota3)
				+ (mediaAritimeticaExercicio)) / pesoTotal);

		return mediaFinal;
	}

	public static String verificarNotaTexto(Double nota) {

		String valorTexto = "";

		if (nota >= 9.0) {
			valorTexto = "A";
		} else if ((nota >= 7.5) && (nota < 9.0)) {
			valorTexto = "B";
		} else if ((nota >= 6.0) && (nota < 7.5)) {
			valorTexto = "C";
		} else if ((nota < 6.0)) {
			valorTexto = "D";
		}

		return valorTexto;
	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 02 - Loester Franco Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

}
