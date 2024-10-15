/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exer02Advanced;

import java.util.Scanner;

public class Exercicio06 {
	public static void main(String[] args) {

		imprimirAutor();

		// TESTE DE CASO - 1
		// 40468,6 M2 = 10 ACRES
		// 10 ACRES TO FT2 = 435600
		// 10 ACRES TO HECTARES = 4,04686 HECTARES

		Scanner scanner = new Scanner(System.in);

		final Double UM_ACRES_EM_M2 = 4046.86;
		final Double UM_ACRE_EM_PES_QUADRADO_FT2 = 43560.00;
		final Double UM_ACRE_EM_HETARES = 0.404686;

		System.out.printf("EXEMPLO : 40468.6 \n");
		System.out.printf("Exercício 06 - Informe a área de um terreno em METRO QUADRADO (M2) : \n");
		Double m2 = Double.parseDouble(scanner.nextLine());

		Double qtdAcres = (m2 / UM_ACRES_EM_M2);
		Double qtdFT2 = (qtdAcres * UM_ACRE_EM_PES_QUADRADO_FT2);
		Double qtdHectares = (qtdAcres * UM_ACRE_EM_HETARES);

		System.out.printf("Exercício 06 - M2 ............: %.2f\n", m2);
		System.out.printf("......................................... \n");

		System.out.printf("Exercício 06 - ACRES .........: %.2f \n", qtdAcres);
		System.out.printf("Exercício 06 - PÉS (FT2) .....: %.2f \n", qtdFT2);
		System.out.printf("Exercício 06 - HECTARES ......: %.2f \n", qtdHectares);

		scanner.close();
	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 6 - Loester Franco Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

}
