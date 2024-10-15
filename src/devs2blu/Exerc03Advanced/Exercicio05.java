/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exerc03Advanced;

import java.util.Scanner;

public class Exercicio05 {

	private static Scanner scanner;

	public static void main(String[] args) {

		imprimirAutor();

		scanner = new Scanner(System.in);

		String[] nomeVariavelEntrada = { "VALOR DO PRODUTO" };
		Double[] valores = new Double[1];

		Integer i = 0;

		for (i = 0; i < 1; i++) {

			System.out.printf("Exercício 04 - Digite o valor de %s : \n", nomeVariavelEntrada[i]);
			valores[i] = Double.parseDouble(scanner.nextLine());
		}

		/*** TRANSFORMANDO VALORES DE VETOR EM VÁRIAVEL ***/
		Double valor = valores[0];

		Double resultadoOperacao = calcularDesconto(valor);

		System.out.printf("Exercício 04 - RESULTADO é : %.2f \n", resultadoOperacao);

		scanner.close();

	}

	public static Double aplicarDesconto(Double valor, Double porcentagem) {
		Double valorDesconto = (valor * porcentagem);
		return (valor - valorDesconto);
	}

	public static Double calcularDesconto(Double valor) {

		final Double PORCENTAGEM_DESCONTO = 0.1; // (10/100) = 0.1; // 10%

		Double resultado = valor;
		Integer operacao = ((valor >= 100.0) ? 1 : 0);

		switch (operacao) {
		case 1:
			resultado = aplicarDesconto(valor, PORCENTAGEM_DESCONTO);
			break;
		default:
			resultado = valor;
			break;
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
