package devs2blu.Aula09.Exerc10.esquenta01;

public class Funcionario {

	private String nome;
	private Double salario;
	private Double ganhoAnual;
	
	public Funcionario() {
		this.setNome("");
		this.setSalario(0.0);
	}
	
	public Funcionario(String nome, Double salario) {
		super();
		this.nome = nome;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {		
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.ganhoAnual = salario * 12.0 ;
		this.salario = salario;
	}
	
	public Double getGanhoAnual() {
		return ganhoAnual;
	}

	@Override
	public String toString() {
		return "Funcionario [nome=" + this.getNome() + ", salario=" + (this.getSalario() ) + "]";
	}
	
	public void exibeDados() {
		System.out.println("Funcionario [nome=" + this.getNome() + ", salario=" + (this.getSalario()) + "]");
	}
	
	public void ganhoAnual() {	
		System.out.println("Funcionario [nome=" + this.getNome() + ", salario=" + this.ganhoAnual + "]");
	}
	
	Funcionario obter() {
		return new Funcionario();
	}
	
	public void addAumento(Double valor){
		this.setSalario( this.getSalario() + valor );
	}
	
}

