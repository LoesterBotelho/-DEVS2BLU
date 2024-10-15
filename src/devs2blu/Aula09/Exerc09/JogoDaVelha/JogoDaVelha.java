/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc09.JogoDaVelha;

public class JogoDaVelha {
	private Tabuleiro tabuleiro;

	private ControladorJogo controlador;

	public JogoDaVelha() {

		tabuleiro = new Tabuleiro(
				new Player('X', "Jogador 1"),
				new Player('O', "Jogador 2")
				);

		controlador = new ControladorJogo(tabuleiro);
	}

	public void iniciar() {
		controlador.iniciar();
	}

	public static void main(String[] args) {
		
		imprimirAutor();
		
		JogoDaVelha jogo = new JogoDaVelha();
		jogo.iniciar();
	}
	
	public static void imprimirAutor() {
		System.out.printf("Autor : Loester Botelho - Java \n");
		System.out.printf("............................................ \n");
	}
}
