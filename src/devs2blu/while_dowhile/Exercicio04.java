package devs2blu.while_dowhile;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Integer num;

		do {
			System.out.printf(" digite um numero (0 para sair) \n");
			num = Integer.parseInt(entrada.next());

		} while (num != 0);

		entrada.close();
	}
}
