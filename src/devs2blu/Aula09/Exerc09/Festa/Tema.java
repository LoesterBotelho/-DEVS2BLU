/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc09.Festa;

public class Tema {

	private String nome = "";
	private String[] listaItens = new String[1];
	private Double precoTema = 0.0;
	private String corDaToalha = "";

	Tema() {
		this.setNome("");
		this.setListaItens(new String[1]);
		this.setPrecoTema(0.0);
		this.setCorDaToalha("");
	}

	Tema(String nome, Double precoTema) {
		this.setNome(nome);
		this.setListaItens(new String[1]);
		this.setPrecoTema(precoTema);
		this.setCorDaToalha("");
	}

	Tema(String nome, Double precoTema, String[] listaItens, String corDaToalha) {
		this.setNome(nome);
		this.setListaItens(listaItens);
		this.setPrecoTema(precoTema);
		this.setCorDaToalha(corDaToalha);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String[] getListaItens() {
		return listaItens;
	}

	public void setListaItens(String[] listaItens) {
		this.listaItens = listaItens;
	}

	public Double getPrecoTema() {
		return precoTema;
	}

	public void setPrecoTema(Double precoTema) {
		this.precoTema = precoTema;
	}

	public String getCorDaToalha() {
		return corDaToalha;
	}

	public void setCorDaToalha(String corDaToalha) {
		this.corDaToalha = corDaToalha;
	}

	@Override
	public String toString() {

		String msg = "Nome do Tema ................................: %s \nLista de Itens Incluido .....................: %s \nPreço do Tema ...............................: %s \nCor da Toalha ...............................: %s \n";

		String msgFormatada = String.format(msg, this.getNome(), String.join(",", this.getListaItens()),
				this.getPrecoTema(), this.getCorDaToalha());

		return msgFormatada;
	}

}
