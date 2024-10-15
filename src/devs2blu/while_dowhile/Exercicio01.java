package devs2blu.while_dowhile;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		Integer num;
		Boolean flag = true;

		System.out.printf("Digite vários números ou 0 para encerrar. \n");
		while (flag) {
			num = Integer.parseInt(entrada.nextLine());

			if (num == 0) {
				flag = false;
			}
		}
		entrada.close();
	}
}