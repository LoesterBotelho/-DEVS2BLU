package devs2blu.matrizVetor;

import java.util.Random;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		
		Integer[][] notasAlunos = new Integer[30][4];

		Random random = new Random();
		
		Double soma = 0.0;
		Double media = 0.0;

		for (var linha = 0; linha < notasAlunos.length; linha++) {

			// reseta valores a cada 4 notas
			soma = 0.0;
			media = 0.0;
					
			for (var coluna = 0; coluna < notasAlunos[linha].length; coluna++) {
				
				/// pelo digitar na mão
				// System.out.printf("DIGITE O VALOR DA MATRIZ[%d][%d] = \n", linha, coluna);				
				// notasAlunos[linha][coluna] = Integer.parseInt(entrada.nextLine());
				
				
				// aleatório
				notasAlunos[linha][coluna] = random.nextInt(10);
				
				System.out.printf("DIGITE O VALOR DA MATRIZ[%d][%d] = %s \n", linha, coluna, notasAlunos[linha][coluna]);
				
				soma += notasAlunos[linha][coluna];
			}

			if (soma > 0) {
				media = (soma / 4);
				System.out.println( "Média : " + media );
			}
		}

	
		
		/***
		 * int[] myMoney = new int[12]; myMoney[0] = 10000; myMoney[1] = 10000;
		 * myMoney[2] = 10000; myMoney[3] = 10000; myMoney[4] = 10000; myMoney[5] =
		 * 10000; myMoney[6] = 10000; myMoney[7] = 10000; myMoney[8] = 10000; myMoney[9]
		 * = 10000; myMoney[10] = 10000; myMoney[11] = 10000;
		 * 
		 * for (int item : myMoney) { System.out.println("My Salary : " + item); }
		 * 
		 * String[] myCars = new String[3]; myCars[0] = "BMW"; myCars[1] = "Volvo";
		 * myCars[2] = "Ford";
		 * 
		 * for (String item : myCars) { System.out.println("My Car : " + item); }
		 ***/

		entrada.close();
		
	}
}
