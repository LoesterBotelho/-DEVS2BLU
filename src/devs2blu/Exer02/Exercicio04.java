/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exer02;

public class Exercicio04 {

	public static void main(String[] args) {

		imprimirAutor();

		Integer anoNascimento = 1978;
		Integer anoAtual = 2024;

		Integer idade = calcularIdade(anoAtual, anoNascimento);

		System.out.printf("Exercício 4 - Idade de um usuário qualquer : %d \n", idade);

	}

	public static Integer calcularIdade(Integer anoAtual, Integer anoNascimento) {
		return (anoAtual - anoNascimento);
	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 1 - Loester Franco Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

}
