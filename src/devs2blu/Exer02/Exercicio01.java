/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exer02;

public class Exercicio01 {

	public static void main(String[] args) {

		imprimirAutor();

		Double saldo = 8500.0;
		Double reajuste = calcularReajuste(saldo);
		Double saldoAjustado = saldo + reajuste;
		
		System.out.printf("__________________________________________________________________________________ \n");
		System.out.printf("| Exercício 1 - Saldo anterior .............................: %.2f \n", saldo);
		System.out.printf("| Exercício 1 - ( + ) REAJUSTE .............................:   %.2f \n", reajuste);
		System.out.printf("| Exercício 1 - ( = ) Saldo com reajuste ...................: %.2f \n", saldoAjustado);
		System.out.printf("|_________________________________________________________________________________ \n");
		
	}

	public static Double calcularReajuste(Double saldo) {
		return  (saldo * 0.01); // (1/100) = 0.01
	}

	public static Double reajustarSaldo(Double saldo) {
		return (saldo + (saldo * 0.01)); // (1/100) = 0.01
	}
	
	public static void imprimirAutor() {
		System.out.printf("Exercício 1 - Loester Franco Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

}
