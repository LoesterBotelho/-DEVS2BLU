/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc09.JogoDaVelha;

public class Tabuleiro {

	char[][] vet = new char[3][3];
	private Player jogador1;
	private Player jogador2;

	public Tabuleiro(Player jogador1, Player jogador2) {
		vet = new char[3][3];
		
		this.setJogador1(jogador1);
		this.setJogador2(jogador2);
	}

	
	
	public char[][] getVet() {
		return vet;
	}


	public Player getJogador1() {
		return jogador1;
	}



	public void setJogador1(Player jogador1) {
		this.jogador1 = jogador1;
	}



	public Player getJogador2() {
		return jogador2;
	}



	public void setJogador2(Player jogador2) {
		this.jogador2 = jogador2;
	}


	public char getNULL_CHAR() {
		return '\0';
	}



	public boolean jogar(int linha, int coluna, char simbolo) {
		if (vet[linha][coluna] == getNULL_CHAR()) {
			vet[linha][coluna] = simbolo;
			return true;
		}
		return false;
	}

	public void imprimir() {
		for (int linha = 0; linha < 3; linha++) {
			for (int coluna = 0; coluna < 3; coluna++) {
				System.out.printf("%s | ", vet[linha][coluna]);
			}
			System.out.printf("\n");
		}
	}

	public boolean verificarVencedor(char simbolo) {
		return verificarLinhasColunas(simbolo) || verificarDiagonais(simbolo);
	}

	private boolean verificarLinhasColunas(char simbolo) {
		for (int linha = 0; linha < 3; linha++) {
			if ((vet[linha][0] == simbolo && vet[linha][1] == simbolo && vet[linha][2] == simbolo)
					|| (vet[0][linha] == simbolo && vet[1][linha] == simbolo && vet[2][linha] == simbolo)) {
				return true;
			}
		}
		return false;
	}

	private boolean verificarDiagonais(char simbolo) {
		return (vet[0][0] == simbolo && vet[1][1] == simbolo && vet[2][2] == simbolo)
				|| (vet[0][2] == simbolo && vet[1][1] == simbolo && vet[2][0] == simbolo);
	}
}
