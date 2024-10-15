/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Exer02;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String args[]) {

		imprimirAutor();
				
		Scanner scanner = new Scanner(System.in);

		System.out.printf("Exercício 6 - Digite a quantidade de folhas : \n");
		Integer entradaPaginasLivro = Integer.parseInt(scanner.nextLine());

		Integer qtdFolhasA4 = calcularPaginasFrenteVerso(entradaPaginasLivro);
		Double preco = calcularValorPagar(qtdFolhasA4);

		System.out.printf("Exercício 5 - FOLHAS DO LIVRO : R$ %d \n", entradaPaginasLivro);
		System.out.printf("Exercício 5 - FOLHAS A4 UTILIZADA (FRENTE E VERSO) : %d \n", qtdFolhasA4);
		System.out.printf("Exercício 5 - TOTAL A PAGAR : R$ %.2f \n", preco);

		scanner.close();

	}

	public static Integer calcularPaginasFrenteVerso(Integer paginas) {
		return (paginas * 2);
	}

	public static Double calcularValorPagar(Integer paginas) {
		return (paginas * 0.08);
	}

	public static void imprimirAutor() {
		System.out.printf("Exercício 1 - Loester Franco Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

}