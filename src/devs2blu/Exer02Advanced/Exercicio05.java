/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exer02Advanced;

import java.util.Scanner;

public class Exercicio05 {

	private static Scanner scanner;

	public static void main(String[] args) {

		imprimirAutor();

		scanner = new Scanner(System.in);

		String[] nomeVariavelEntrada = { "A", "B", "C", "D", "E", "F" };
		Double[] valores = new Double[6];

		Integer i = 0;

		for (i = 0; i <= 5; i++) {

			System.out.printf("Exercício 05 - Digite o valor da Váriavel %s : \n", nomeVariavelEntrada[i]);
			valores[i] = Double.parseDouble(scanner.nextLine());
		}

		/* TRANSFORMANDO VALORES DE VETOR EM VÁRIAVEL */
		Double a = valores[0];
		Double b = valores[1];
		Double c = valores[2];
		Double d = valores[3];
		Double e = valores[4];
		Double f = valores[5];

		Double y = calcularY(a, b, c, d, e, f);
		Double x = calcularX(a, b, c, d, e, f);

		System.out.printf("Exercício 05 - Digite o valor da Váriavel X é %f \n", x);
		System.out.printf("Exercício 05 - Digite o valor da Váriavel Y é %f \n", y);

		Double validacaoC = (a * x) + (b * y);
		Double validacaoF = (d * x) + (e * y);

		// caso for para sobrescrever os valores
		Boolean sobrescreverValores = false;

		if (sobrescreverValores) {
			c = validacaoC;
			f = validacaoF;
		}

		String validoC = (Double.compare(c, validacaoC) == 0) ? "VALIDO" : "INVÁLIDO";
		String validoF = (Double.compare(f, validacaoF) == 0) ? "VALIDO" : "INVÁLIDO";

		System.out.printf("Exercício 05 - AX + BY = C É %s \n", validoC);
		System.out.printf("Exercício 05 - DX + EY = F É %s \n", validoF);

		System.out.printf("Exercício 05 - C = %.2f | VALIDAÇÃO C = %.2f \n", c, validacaoC);
		System.out.printf("Exercício 05 - F = %.2f | VALIDAÇÃO F = %.2f \n", f, validacaoF);

		System.out.printf("---------------------------------------------- \n");

		System.out.printf("(A * X) + (B * Y) = C |(%.2f * %.2f) + (%.2f * %.2f) = %.2f \n", a, x, b, y, c);
		System.out.printf("(A * X) + (B * Y) = C |(%.2f) + (%.2f) = %.2f \n", a * x, b * y, c);

		System.out.printf("---------------------------------------------- \n");

		System.out.printf("(D * X) + (E * Y) = F |(%.2f * %.2f) + (%.2f * %.2f) = %.2f \n", d, x, e, y, f);
		System.out.printf("(D * X) + (E * Y) = F |(%.2f) + (%.2f) = %.2f \n", d * x, e * y, f);

		scanner.close();

	}

	public static Double calcularY(Double a, Double b, Double c, Double d, Double e, Double f) {
		Double y = ((a * f) - (c * d)) / ((a * e) - (b * d));
		return y;
	}

	public static Double calcularX(Double a, Double b, Double c, Double d, Double e, Double f) {
		Double x = ((c * e) - (b * f)) / ((a * e) - (b * d));
		return x;
	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 5 - Loester Franco Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

}
