/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula12.Exerc02;

public class MainTeste {

	public static void main(String[] args) {

		imprimirAutor();
		
		Conta conta = new Conta("João Silva", 1500.0);
		conta.depositar(300.00);
		conta.depositar(300.00);
		conta.depositar(500.00);
		conta.depositar(500.00);
		conta.sacar(200.0);
		conta.sacar(200.0);

		Relatorio relatorio = new Relatorio();

		relatorio.gerarRelatorioSaldo(conta);
		relatorio.gerarRelatorioTransacoes(conta.getTransacoes());
	}

	public static void imprimirAutor() {
		System.out.printf("Autor : Loester Botelho - Java \n");
		System.out.printf("............................................ \n");
	}
}
