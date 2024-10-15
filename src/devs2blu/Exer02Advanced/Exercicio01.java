/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exer02Advanced;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		imprimirAutor();

		// x^2 = 6^2 + 8^2
		// x^2 = sq(100)
		// x = 10 cm

		// Veja mais sobre "Teorema de Pitágoras" em:
		// https://brasilescola.uol.com.br/matematica/teorema-pitagoras.htm

		Scanner scanner = new Scanner(System.in);

		System.out.printf("Exercício 01 - O Cateto Menor (C) : \n");
		Double cCatetoMenor = Double.parseDouble(scanner.nextLine());

		System.out.printf("Exercício 01 - O Cateto Maior (B) : \n");
		Double bCatetoMaior = Double.parseDouble(scanner.nextLine());

		Double aHipotenusa = calcularHipotenusa(bCatetoMaior, cCatetoMenor);

		System.out.printf("Exercício 1 - A Hipotenusa (A): %.2f \n", aHipotenusa);
		
		scanner.close();

	}

	public static Double calcularHipotenusa(Double b, Double c) {
		Double a = sq(squared(b) + squared(c));

		return a;
	}

	public static Double squared(Double x) {
		return Math.pow(x, 2);
	}

	public static Double sq(Double x) {
		return Math.sqrt(x);
	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 1 - Loester Franco Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

}
