/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula12.Exerc01;

public class Aluguel {

	private Livro livroAlugado;

	public Aluguel() {

	}

	public Aluguel(Livro livroAlugado) {
		this.livroAlugado = livroAlugado;
	}

	public Livro getLivroAlugado() {
		return livroAlugado;
	}

	public void setLivroAlugado(Livro livroAlugado) {
		this.livroAlugado = livroAlugado;
	}

	@Override
	public String toString() {
		return "Aluguel [livroAlugado=" + livroAlugado + "]";
	}

	public void alugar( Livro livroAlugado ) {
		if (!livroAlugado.isAlugado()) {
			livroAlugado.setAlugado(true);
			System.out.println("O livro " + livroAlugado.getTitulo() + " foi alugado.");
		} else {
			System.out.println("O livro " + livroAlugado.getTitulo() + " já está alugado.");
		}
	}

}
