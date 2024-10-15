/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc09.Questao;

public class Disciplina {

	/// Disciplina = Àrea de Conhecimento
	/// Disciplina = Matemática

	/// matéria = é o que se estuda dentro de uma disciplina
	/// matéria = Soma , Subtração , Divisão e Multiplicação (As Quatro Operações
	/// Aritiméticas Básicas)

	private String disciplina = "";
	private Questao[] listaQuestoes = {};

	Disciplina() {
		this.setDisciplina("");
		this.setListaQuestoes(new Questao[1]);
	}

	Disciplina(String disciplina) {
		this();
		
		this.setDisciplina(disciplina);
	}

	Disciplina(String disciplina, Questao[] listaQuestoes) {
		this.setDisciplina(disciplina);
		this.setListaQuestoes(listaQuestoes);
	}

	public String getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}

	public Questao[] getListaQuestoes() {
		return listaQuestoes;
	}

	public void setListaQuestoes(Questao[] listaQuestoes) {
		this.listaQuestoes = listaQuestoes;
	}

	@Override
	public String toString() {
		return this.getDisciplina();
	}

}
