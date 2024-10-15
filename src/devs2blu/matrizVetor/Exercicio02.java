package devs2blu.matrizVetor;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Integer[][] matriz3_3 = new Integer[3][3];

		System.out.printf("DIGITE UMA MATRIZ DE : 3 X 3 \n");

		for (var linha = 0; linha < matriz3_3.length; linha++) {
			for (var coluna = 0; coluna < matriz3_3[linha].length; coluna++) {
				System.out.printf("DIGITE O VALOR DA MATRIZ[%d][%d] = \n", linha, coluna);
				matriz3_3[linha][coluna] = Integer.parseInt(entrada.nextLine());
			}
		}

		for (var linha = 0; linha < matriz3_3.length; linha++) {
			for (var coluna = 0; coluna < matriz3_3[linha].length; coluna++) {
				System.out.printf("DIGITE O VALOR DA MATRIZ[%d][%d] = %d \n", linha, coluna, matriz3_3[linha][coluna]);				
			}
		}

		entrada.close();
	}
}
