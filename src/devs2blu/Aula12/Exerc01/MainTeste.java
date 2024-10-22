/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula12.Exerc01;

public class MainTeste {
	public static void main(String[] args) {

		imprimirAutor();
		
		Categoria categoria1 = new Categoria("Livros Interessantes - Tema 1");
		Categoria categoria2 = new Categoria("Livros Interessantes - Tema 2");
		
		Autor autor1 = new Autor("George Orwell");
		Autor autor2 = new Autor("Miguel de Cervantes");

		Livro livro1 = new Livro("1984", autor1 , categoria1 );
		Livro livro2 = new Livro("Dom Quixote", autor2 , categoria2);
		
		Biblioteca biblioteca = new Biblioteca();

		biblioteca.adicionarLivro(livro1);
		biblioteca.adicionarLivro(livro2);

		Aluguel aluguel01 = new Aluguel();
		aluguel01.alugar(livro1);
		
		Aluguel aluguel02 = new Aluguel();
		aluguel02.alugar(livro2);
		
		Relatorio relatorio = new Relatorio();
		
		System.out.println("");
		
		// relatórios individual
		relatorio.gerarRelatorio(livro1);
		relatorio.gerarRelatorio(livro2);

		System.out.println("");
		// mostrar relatório da biblioteca em todos livros
		relatorio.mostrarLivrosBibliotecas( biblioteca );
	}
	
	public static void imprimirAutor() {
		System.out.printf("Autor : Loester Botelho - Java \n");
		System.out.printf("............................................ \n\n");
	}	
}
