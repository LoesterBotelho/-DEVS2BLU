/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exerc04;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		imprimirAutor();

		Integer tentativa = 1;

		String user = "admin";
		String pass = "docker";

		String usuarioDigitado = "";
		String senhaDigitado = "";

		System.out.println("Sistema de Login");

		Scanner entrada = new Scanner(System.in);

		while (tentativa <= 3) {

			System.out.println("Usuário : ");
			usuarioDigitado = entrada.nextLine();

			System.out.println("Senha : ");
			senhaDigitado = entrada.nextLine();

			if ((usuarioDigitado.equals(user)) && (senhaDigitado.equals(pass))) {
				System.out.println("LOGIN BEM SUCEDIDO !");
				break;
			} else {
				tentativa++;
				System.out.printf("ERRO %d TENTATIVA \n", tentativa);

				if (tentativa == 3) {
					System.out.printf("FALHA NA AUTENTICAÇÃO - PROGRAMA ENCERRADO\n", tentativa);
					break;
				}

			}

		}

		entrada.close();
	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 04 - Loester Botelho - Java \n");
		System.out.printf("............................................ \n");
	}
}
