/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula12.Exerc01;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
	private List<Livro> livros = new ArrayList<>(); // Composição

	public Biblioteca() {
		livros = new ArrayList<>();
	}

	public List<Livro> obterLivro(Livro livro) {
		return livros;
	}

	public void adicionarLivro(Livro livro) {
		livros.add(livro);
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	// CORRIGIR AQUI LISTA
	@Override
	public String toString() {
		
		StringBuilder relatorio = new StringBuilder();
		
		relatorio.append("Biblioteca [livros=\n");
		
		for (var item : livros) {
			relatorio.append( item.toString() + "\n");
		}
		
		relatorio.append("]");
		
		
		return relatorio.toString() ;
	}

}