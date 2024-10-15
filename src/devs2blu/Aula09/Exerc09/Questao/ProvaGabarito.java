/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc09.Questao;

public class ProvaGabarito {

	private Double numeroAcertos = 0.0;
	private Double numeroErros = 0.0;
	private Double nota = 0.0;
	private Prova prova = new Prova();
	private Questao[] listaQuestoes = {};
	private String[] listaRespostas = {};
	private Aluno aluno = new Aluno();

	ProvaGabarito() {
		this.setListaRespostas(new String[1]);
		this.setListaQuestoes(new Questao[1]);
		this.setAluno(new Aluno());
		this.setProva(new Prova());
		
		this.setNumeroAcertos(0.0);
		this.setNumeroErros(0.0);
		this.setNota(0.0);
	}

	ProvaGabarito(Prova prova, Aluno aluno, String[] listaRespostas) {
		this();
		
		this.prova = prova;
		this.aluno = aluno;
		this.listaRespostas = listaRespostas;
	}

	public Double getNumeroAcertos() {
		return numeroAcertos;
	}

	public void setNumeroAcertos(Double numeroAcertos) {
		this.numeroAcertos = numeroAcertos;
	}

	public Double getNumeroErros() {
		return numeroErros;
	}

	public void setNumeroErros(Double numeroErros) {
		this.numeroErros = numeroErros;
	}

	public Double getNota() {
		return nota;
	}

	public void setNota(Double nota) {
		this.nota = nota;
	}

	public Prova getProva() {
		return prova;
	}

	public void setProva(Prova prova) {
		this.prova = prova;
	}

	public Questao[] getListaQuestoes() {
		return listaQuestoes;
	}

	public void setListaQuestoes(Questao[] listaQuestoes) {
		this.listaQuestoes = listaQuestoes;
	}

	public String[] getListaRespostas() {
		return listaRespostas;
	}

	public void setListaRespostas(String[] listaRespostas) {
		this.listaRespostas = listaRespostas;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public void corrigirProva() {

		this.setListaQuestoes( this.getProva().getProvaAleatoriaGerada() );

		Integer qtdQuestoes = this.listaQuestoes.length;

		for (var i = 0; i < this.listaQuestoes.length; i++) {

			/*
			 * System.out.printf("%s = %s = %s \n", listaQuestoes[i].getResposta(),
			 * listaRespostas[i], listaQuestoes[i].resposta.equals(listaRespostas[i]));
			 */

			if (listaQuestoes[i].getResposta().equals(this.getListaRespostas()[i])) {
				numeroAcertos++;
			} else {
				numeroErros++;
			}

			/*
			 * System.out.printf("NR : %s - DESCRIÇÃO : %s - RESPOSTA : %s \n",
			 * this.prova.provaAleatoriaGerada[i].getNumeroQuestao(),
			 * this.prova.provaAleatoriaGerada[i].getDescricao(),
			 * this.prova.provaAleatoriaGerada[i].getResposta();
			 */
		}

		this.nota = (this.getNumeroAcertos() / qtdQuestoes) * 10;

		if (this.nota >= 7) {
			System.out.printf("PROVA : %s - ALUNO : %s - DISCIPLINA : %s - APROVADO - SUA NOTA É %.2f \n",
					this.prova.getProva(), this.aluno.getNome(), this.getProva().disciplina(), getNota());
		}

		if (this.nota < 7) {
			System.out.printf("PROVA : %s - ALUNO : %s - DISCIPLINA : %s -    EXAME - SUA NOTA É %.2f \n",
					this.prova.getProva(), this.aluno.getNome(), this.getProva().disciplina(), this.getNota());
		}

	}

	@Override
	public String toString() {
		return this.getListaRespostas().toString();
	}

}
