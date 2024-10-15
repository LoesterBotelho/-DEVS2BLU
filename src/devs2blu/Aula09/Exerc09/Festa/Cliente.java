/*
 * Autor : Loester Franco Botelho - JAVA
 */
package devs2blu.Aula09.Exerc09.Festa;

public class Cliente {

	private String nome = "";
	private String telefone = "";
	private LocacoesSaldo saldo = new LocacoesSaldo(this);

	Cliente() {
		this.setNome("");
		this.setTelefone("");
	}

	Cliente(String nome, String telefone) {
		this.setNome(nome);
		this.setTelefone(telefone);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public LocacoesSaldo getSaldo() {
		return saldo;
	}

	public void setSaldo(LocacoesSaldo saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {

		String msg = "Nome ........................................: %s \nTelefone ....................................: %s \n";

		String msgFormatada = String.format(msg, this.getNome(), this.getTelefone());

		return msgFormatada;

	}

}
