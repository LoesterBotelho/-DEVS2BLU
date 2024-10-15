/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exerc03Advanced;

public class Exercicio03 {

	public static void main(String[] args) {

		imprimirAutor();

		System.out.printf("Exercício 03 - %s \n", calcularCredito("Maria  ", 150.0));
		System.out.printf("Exercício 03 - %s \n", calcularCredito("Sofia  ", 250.0));
		System.out.printf("Exercício 03 - %s \n", calcularCredito("Isabela", 550.0));
		System.out.printf("Exercício 03 - %s \n", calcularCredito("Rafaela", 650.0));
		System.out.printf("Exercício 03 - %s \n", calcularCredito("Loester", 10000.0));

	}

	public static String calcularCredito(String nome, Double saldoEmConta) {

		Double limiteCreditoLiberado = 0.0;
		Double percentual = 0.0;

		final Double CLIENTE_MAIOR_QUE_601 = 0.4;
		final Double CLIENTE_MAIOR_QUE_401_MENOR_QUE_600 = 0.3;
		final Double CLIENTE_MAIOR_QUE_201_MENOR_QUE_400 = 0.2;
		final Double CLIENTE_MAIOR_QUE_0_MENOR_QUE_200 = 0.0;

		if (saldoEmConta >= 601.0) {

			limiteCreditoLiberado = saldoEmConta * CLIENTE_MAIOR_QUE_601;
			percentual = 100 * CLIENTE_MAIOR_QUE_601;

		} else if ((saldoEmConta >= 401) && (saldoEmConta < 600)) {

			limiteCreditoLiberado = saldoEmConta * CLIENTE_MAIOR_QUE_401_MENOR_QUE_600;
			percentual = 100 * CLIENTE_MAIOR_QUE_401_MENOR_QUE_600;

		} else if ((saldoEmConta >= 201) && (saldoEmConta < 400)) {

			limiteCreditoLiberado = saldoEmConta * CLIENTE_MAIOR_QUE_201_MENOR_QUE_400;
			percentual = 100 * CLIENTE_MAIOR_QUE_201_MENOR_QUE_400;

		} else if ((saldoEmConta >= 0) && (saldoEmConta < 200)) {

			limiteCreditoLiberado = saldoEmConta * CLIENTE_MAIOR_QUE_0_MENOR_QUE_200;
			percentual = 100 * CLIENTE_MAIOR_QUE_0_MENOR_QUE_200;

		}

		String textoRetorno = String.format(
				"CLIENTE : %s - VALOR NA CONTA %.02f - PERCENTUAL : %.01f - LIMITE LIBERADO : %.02f", nome,
				saldoEmConta, percentual, limiteCreditoLiberado);

		return textoRetorno;
	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 03 - Loester Franco Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

}
