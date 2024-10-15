/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exerc03Advanced;

import java.util.Scanner;

public class Exercicio04 {

	private static Scanner scanner;

	public static void main(String[] args) {

		imprimirAutor();

		scanner = new Scanner(System.in);

		String[] nomeVariavelEntrada = { "NÚMERO 1", "NÚMERO 2" };
		Double[] valores = new Double[2];

		Integer i = 0;

		for (i = 0; i <= 1; i++) {

			System.out.printf("Exercício 04 - Digite o valor de %s : \n", nomeVariavelEntrada[i]);
			valores[i] = Double.parseDouble(scanner.nextLine());
		}

		/* TRANSFORMANDO VALORES DE VETOR EM VÁRIAVEL */
		Double valor1 = valores[0];
		Double valor2 = valores[1];

		System.out.printf("Exercício 04 - EXEMPLO : 1 \n");
		System.out.printf("Exercício 04 - SELECIONAR \n");
		System.out.printf("Exercício 04 - DITE UMA DAS OPÇÕES :  \n");
		System.out.printf("Exercício 04 - OPÇÃO : 1 - SOMA \n");
		System.out.printf("Exercício 04 - OPÇÃO : 2 - SUBTRACAO \n");
		System.out.printf("Exercício 04 - OPÇÃO : 3 - MULTIPLICACAO \n");
		System.out.printf("Exercício 04 - OPÇÃO : 4 - DIVISAO \n");
		System.out.printf("------------------------------------- \n");

		System.out.printf("Exercício 04 - DIGITE UMA OPÇÃO : \n");
		Integer operacao = Integer.parseInt(scanner.nextLine());

		Double resultadoOperacao = calcular(valor1, valor2, operacao);

		String ehPar = verificarPar(resultadoOperacao);
		String ehPositivo = verificarPositivo(resultadoOperacao);

		System.out.printf("Exercício 04 - RESULTADO é : %.2f \n", resultadoOperacao);
		System.out.printf("Exercício 04 - O NÚMERO É : %S \n", ehPar);
		System.out.printf("Exercício 04 - O NÚMERO É  : %S \n", ehPositivo);

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

	public static Double calcular(Double valor1, Double valor2, Integer operacao) {

		Double resultado = 0.0;

		switch (operacao) {
		case 1:
			resultado = somar(valor1, valor2);
			break;
		case 2:
			resultado = subtrair(valor1, valor2);
			break;
		case 3:
			resultado = multiplicar(valor1, valor2);
			break;
		case 4:
			resultado = dividir(valor1, valor2);
			break;
		default:
			System.out.println("ERRO - não foi possível calcular : OPERAÇÃO INVÁLIDA");
		}

		return resultado;
	}

	public static String verificarPositivo(Double valor) {

		String ehPar = "NEGATIVO";

		if (valor > 0) {
			ehPar = "POSITIVO";
		}

		if (valor == 0) {
			ehPar = "ZERO";
		}

		if ((valor >= 0.0000000000001) && (valor <= 0.999999999999)) {
			ehPar = "ZERO PONTO FLUTUANTE";
		}

		return ehPar;
	}

	public static String verificarPar(Double valor) {

		String ehPar = "O VALOR DIGITADO É ZERO";

		/*** TRANSFORMA NEGATIVO EM POSITIVO ***/
		if (valor < 0) {
			valor *= -1.0;
		}

		if (valor >= 0) {
			ehPar = (((valor % 2) == 0) ? "PAR" : "IMPAR");
		}

		return ehPar;
	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 04 - Loester Franco Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

}
