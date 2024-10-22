/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula12.Exerc01;

public class Livro {
	private String titulo;
	private Autor autor; // Associação
	private Categoria categoria; // Agregação
	private boolean alugado;

	public Livro() {

	}

	public Livro(String titulo, Autor autor, Categoria categoria) {
		this.titulo = titulo;
		this.autor = autor;
		this.alugado = false;
		this.categoria = categoria;
	}
	
	public Livro(String titulo, Autor autor) {
		this.titulo = titulo;
		this.autor = autor;
		this.alugado = false;
	}

	public String getTitulo() {
		return titulo;
	}

	public Autor getAutor() {
		return autor;
	}

	public boolean isAlugado() {
		return alugado;
	}

	public void setAlugado(boolean alugado) {
		this.alugado = alugado;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
	@Override
	public String toString() {
		return "Livro [titulo=" + titulo + ", autor=" + autor + ", categoria=" + categoria + ", alugado=" + (this.isAlugado() ? "Alugado" : "Disponível") + "]";		
	}

}