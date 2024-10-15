/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc09.Questao;

public class Materia {

	/// Disciplina = Àrea de Conhecimento
	/// Disciplina = Matemática

	/// matéria = é o que se estuda dentro de uma disciplina
	/// matéria = Soma , Subtração , Divisão e Multiplicação (As Quatro Operações
	/// Aritiméticas Básicas)

	private String nomeMateria = "";
	private Integer serie = 0;

	Materia() {
		this.setNomeMateria("");
		this.setSerie(0);
	}

	Materia(String nomeMateria) {
		this.nomeMateria = nomeMateria;
		this.serie = 1;
	}

	Materia(String nomeMateria, Integer serie) {
		this.nomeMateria = nomeMateria;
		this.serie = serie;
	}

	public String getNomeMateria() {
		return nomeMateria;
	}

	public void setNomeMateria(String nomeMateria) {
		this.nomeMateria = nomeMateria;
	}

	public Integer getSerie() {
		return serie;
	}

	public void setSerie(Integer serie) {
		this.serie = serie;
	}

	@Override
	public String toString() {

		String msg = "Matéria : %s - Série : %s \n";

		String msgFormatada = String.format(msg, this.getNomeMateria(), this.getSerie());

		return msgFormatada;
	}

}
