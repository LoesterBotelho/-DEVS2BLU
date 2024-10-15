/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exerc03;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		imprimirAutor();

		Scanner scanner = new Scanner(System.in);

		System.out.printf("Exercício 02 - Informe a idade : \n");
		Integer idade = Integer.parseInt(scanner.nextLine());

		if (idade >= 18) {                           // 18 , +18 , n++          
			System.out.println("Adulto");            
		} else if ((idade <= 17) && (idade >= 14)) { // 14,15,16,17
			System.out.println("Juvenil B");
		} else if ((idade <= 13) && (idade >= 11)) { // 11,12,13
			System.out.println("Juvenil A");
		} else if ((idade <= 10) && (idade >= 8)) { // 10,9,8
			System.out.println("Infantil B");
		} else if ((idade <= 7) && (idade >= 5)) { // 7,6,5
			System.out.println("Infantil A");
		} else {
			System.out.println("Exercício 02 - Espere a Criançar ter idade minima.");
		}

		scanner.close();

	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 02 - Loester Franco Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

}
