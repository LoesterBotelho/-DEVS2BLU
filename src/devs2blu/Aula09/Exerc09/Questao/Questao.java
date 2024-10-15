/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc09.Questao;

public class Questao {

	/*
	 * Matérias Matemática, Ciências, História, Geografia, Língua Portuguesa,
	 * Inglês, Artes, Educação Física, Filosofia, Sociologia, Química, Biologia
	 */

	/// Disciplina = área de conhecimento
	/// matéria = é o que se estuda dentro de uma disciplina

	/*
	 * Na prática, cada disciplina centra-se numa área de conhecimento diferenciada.
	 * No entanto, quando um estudante realiza um estudo, uma investigação ou um
	 * projeto específico, que gira em torno de um único tema central, trata-se de
	 * uma matéria de estudo.
	 */

	private Integer numeroQuestao;
	private String descricao;
	private String resposta;
	private Materia materia;
	private Integer bimestre;

	Questao() {
		this.setNumeroQuestao(0);
		this.setDescricao("");
		this.setResposta("");
		this.setMateria(new Materia());
		this.setBimestre(0);		
	}

	Questao(Integer numeroQuestao, String descricao, String resposta, Materia materia, Integer bimestre) {
		this.setNumeroQuestao(numeroQuestao);
		this.setDescricao(descricao);
		this.setResposta(resposta);
		this.setMateria(materia);
		this.setBimestre(bimestre);
	}

	public Integer getNumeroQuestao() {
		return numeroQuestao;
	}

	public void setNumeroQuestao(Integer numeroQuestao) {
		this.numeroQuestao = numeroQuestao;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getResposta() {
		return resposta;
	}

	public void setResposta(String resposta) {
		this.resposta = resposta;
	}

	public Materia getMateria() {
		return materia;
	}

	public void setMateria(Materia materia) {
		this.materia = materia;
	}

	public Integer getBimestre() {
		return bimestre;
	}

	public void setBimestre(Integer bimestre) {
		this.bimestre = bimestre;
	}

	@Override
	public String toString() {

		String msg = "%s - Bimestre: %s - Questão %s: %s - Resp.: %s \n";

		String msgFormatada = String.format(msg, this.getMateria(), this.getBimestre(), this.getNumeroQuestao(),
				this.getDescricao(), this.getResposta());

		return msgFormatada;
	}

}
