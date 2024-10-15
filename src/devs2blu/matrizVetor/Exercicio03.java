package devs2blu.matrizVetor;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Integer[][][] matriz3_3_3 = new Integer[3][3][3];

		System.out.printf("DIGITE UMA MATRIZ DE : 3 X 3 X 3 \n");

		for (var linha = 0; linha < matriz3_3_3.length; linha++) {
			for (var coluna = 0; coluna < matriz3_3_3[linha].length; coluna++) {
				for (var profundidade = 0; profundidade < matriz3_3_3[linha][coluna].length; profundidade++) {

					matriz3_3_3[linha][coluna][profundidade] = linha + coluna + profundidade;

				}
			}
		}

		Double somaPar = 0.0;
		Double somaImpar = 0.0;
		
		for (var linha = 0; linha < matriz3_3_3.length; linha++) {
			for (var coluna = 0; coluna < matriz3_3_3[linha].length; coluna++) {
				for (var profundidade = 0; profundidade < matriz3_3_3[linha][coluna].length; profundidade++) {

					Integer valor = matriz3_3_3[linha][coluna][profundidade];

					if (((valor % 2) == 0)) { // par
						//continue;
						somaPar+= valor;
					} else { // impar
						somaImpar+= valor;
					}

					/*
					System.out.printf("DIGITE O VALOR DA MATRIZ[%d][%d][%d] = %d \n", linha, coluna, profundidade,
							matriz3_3_3[linha][coluna][profundidade]);
							*/
				}
			}
		}

		System.out.printf("Par : %.2f \n",somaPar);
		System.out.printf("Impar : %.2f \n",somaImpar);
		entrada.close();
	}
}
