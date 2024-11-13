package br.com.exemplo.bridge2.empregado;

public abstract class Empregado {
	private String nome;
	private Integer idade;
	private double salario;

	public Empregado() {

	}

	public Empregado(String nome, Integer idade, double salario) {
		this.nome = nome;
		this.idade = idade;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return "Empregado [nome=" + nome + ", idade=" + idade + ", salario=" + salario + "]";
	}

}
