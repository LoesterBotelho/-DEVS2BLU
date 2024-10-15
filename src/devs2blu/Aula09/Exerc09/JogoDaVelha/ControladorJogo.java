/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc09.JogoDaVelha;

import java.util.Scanner;

public class ControladorJogo {
	private Tabuleiro tabuleiro;
	private int jogada;

	public Tabuleiro getTabuleiro() {
		return tabuleiro;
	}

	public void setTabuleiro(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;
	}

	public int getJogada() {
		return jogada;
	}

	public void setJogada(int jogada) {
		this.jogada = jogada;
	}

	public ControladorJogo() {

		new Tabuleiro(new Player('X', "Jogador 1"), new Player('O', "Jogador 2"));

		this.setJogada(jogada);
	}

	public ControladorJogo(Tabuleiro tabuleiro) {
		this.setTabuleiro(tabuleiro);
		this.setJogada(jogada);
	}

	public void iniciar() {
		Scanner entrada = new Scanner(System.in);
		boolean venceu = false;

		while (!venceu) {
			Player atual = ((this.getJogada() % 2 == 1) 
					? this.getTabuleiro().getJogador2()
					: this.getTabuleiro().getJogador1());

			System.out.printf("Vez do %s. Escolha linha e coluna (1-3):%n", atual.nome);

			int linha = obterposicaoicao(entrada, "linha") - 1;
			int coluna = obterposicaoicao(entrada, "coluna") - 1;

			if (tabuleiro.jogar(linha, coluna, atual.simbolo)) {

				tabuleiro.imprimir();

				venceu = tabuleiro.verificarVencedor(atual.simbolo);

				jogada++;

			} else {

				System.out.println("posicaoição já usada. Tente novamente.");

			}

			if (venceu) {

				System.out.printf("Parabéns, %s venceu!%n", atual.nome);

			} else if (jogada > 9) {

				System.out.printf("Empate. Ninguém venceu.\n");
				break;
			}
		}
		entrada.close();
	}

	private int obterposicaoicao(Scanner entrada, String tipo) {
		int posicao;

		do {
			System.out.printf("Entre com a %s (1-3): ", tipo);
			while (!entrada.hasNextInt()) {

				System.out.printf("Entrada inválida. Entre com a %s (1-3): ", tipo);
				entrada.next();
			}

			posicao = entrada.nextInt();

		} while (posicao < 1 || posicao > 3);

		return posicao;
	}
}
