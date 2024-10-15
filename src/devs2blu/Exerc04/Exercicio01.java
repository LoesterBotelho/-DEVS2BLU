/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exerc04;

public class Exercicio01 {

	public static void main(String[] args) {

		imprimirAutor();

		Double chico = 1.50;
		Double chicoCrescimento = 0.02;

		Double juca = 1.10;
		Double jucaCrescimento = 0.03;

		Integer anos = 0;

		System.out.printf("ANO %d | CHICO = %.02f | JUCA = %.02f \n", anos, chico, juca);
		
		while (juca <= chico) {
			chico += chicoCrescimento;
			juca += jucaCrescimento;
			anos++;
			System.out.printf("ANO %d | CHICO = %.02f | JUCA = %.02f \n", anos, chico, juca);
		}

		System.out.printf("RESPOSTA : %d ANOS \n", anos);
		
	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 01 - Loester Botelho - Java \n");
		System.out.printf("............................................ \n");
	}
}
