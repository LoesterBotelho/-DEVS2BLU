package devs2blu.while_dowhile;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.printf("Informe um número para calcular a taboada : \n");
		Integer num = Integer.parseInt(entrada.nextLine());

		System.out.printf("Informe um número para calcular a taboada : \n");
		String operador = entrada.nextLine();



		for (var i = 1; i <= 10; i++) {
			
			Double resultado = 0.0;
			
			if (operador.equals("+")) { resultado = (double) (num + i);			}
			if (operador.equals("-")) { resultado = (double) (num - i);			}
			if (operador.equals("*")) { resultado = (double) (num * i);			}
			if (operador.equals("/")) { resultado = (double) (num / i);			}
			if (operador.equals("%")) { resultado = (double) (num % i);			}
			
			System.out.printf("\n %d %s %d = %d ", num, operador, i, resultado);
		}

		entrada.close();
	}
}
