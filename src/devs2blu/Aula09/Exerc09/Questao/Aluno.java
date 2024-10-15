/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc09.Questao;

public class Aluno {

	private Integer numeroChamada = 0;
	private String nome = "";

	Aluno() {
		this.setNome("");
		this.setNumeroChamada(0);
	}

	Aluno(Integer numeroChamada, String nome) {
		this.setNumeroChamada(numeroChamada);
		this.setNome(nome);
	}

	public Integer getNumeroChamada() {
		return numeroChamada;
	}

	public void setNumeroChamada(Integer numeroChamada) {
		this.numeroChamada = numeroChamada;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {

		String msg = "Número chamada : %s - Nome Aluno : %s \n";

		String msgFormatada = String.format(msg, this.getNumeroChamada(), this.getNome());

		return msgFormatada;
	}

}
