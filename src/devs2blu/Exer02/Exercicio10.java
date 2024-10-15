/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exer02;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String args[]) {

		imprimirAutor();

		Scanner scanner = new Scanner(System.in);

		System.out.printf("Exercício 10 - Digite Valor Exemplo 1758.75 \n");
		System.out.printf("Exercício 10 - DIGITE UM SALÁRIO A SER CALCULADO : \n");

		Double salarioBase = Double.parseDouble(scanner.nextLine());

		Double acrescimoBonus = calcularAcrecimoBonus(salarioBase);
		Double decrescimoImposto = calcularDecrescimoImposto(salarioBase);

		Double valorPagar = CalcularDesconto(salarioBase, acrescimoBonus, decrescimoImposto);

		System.out.printf("__________________________________________________________________________________ \n");
		System.out.printf("| Exercício 10 - .................................................................. \n");
		System.out.printf("| Exercício 10 - SALÁRIO BASE .........................: %.2f \n", salarioBase);
		System.out.printf("| Exercício 10 - ( + ) SALÁRIO BONUS ..................:   %.2f \n", acrescimoBonus);
		System.out.printf("| Exercício 10 - ( - ) SALÁRIO DESCONTO IRPF ..........:   %.2f \n", decrescimoImposto);
		System.out.printf("| Exercício 10 - .................................................................. \n");
		System.out.printf("| Exercício 10 - ( = ) SALÁRIO A RECEBER ..............: %.2f \n", valorPagar);
		System.out.printf("|_________________________________________________________________________________ \n");

		scanner.close();

	}

	public static Double calcularAcrecimoBonus(Double salarioBase) {
		return (salarioBase * 0.05); // (5/100) = 0.05
	}

	public static Double calcularDecrescimoImposto(Double salarioBase) {
		return (salarioBase * 0.07); // (7/100) = 0.07
	}

	public static Double CalcularDesconto(Double salarioBase, Double acrescimos, Double descontos) {
		Double calculoFolha = salarioBase;
		calculoFolha += acrescimos;
		calculoFolha -= descontos;

		return calculoFolha;
	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 1 - Loester Franco Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

}