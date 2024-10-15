package devs2blu.Aula09.Exerc10.esquenta01;

public class Assistente extends Funcionario {

	private String numeroMatricula;
	private Double bonusSalario;
	
	
	public Assistente() {
		super();
	}

		
	public Assistente(String numeroMatricula) {
		super();
		this.numeroMatricula = numeroMatricula;
	}


	public Double getBonusSalario() {
		return bonusSalario;
	}


	public void setBonusSalario(Double bonusSalario) {
		this.bonusSalario = bonusSalario;
	}


	public String getNumeroMatricula() {
		return numeroMatricula;
	}



	public void setNumeroMatricula(String numeroMatricula) {
		this.numeroMatricula = numeroMatricula;
	}

	@Override
	public String toString() {
		return "Assistente [Mátricula="+this.getNumeroMatricula()+", nome=" + super.getNome() + ", salario=" + super.getSalario() + "]";
	}

	@Override
	public void exibeDados() {
		System.out.println("Assistente [Mátricula="+this.getNumeroMatricula()+", nome=" + super.getNome() + ", salario=" + super.getSalario() + "]");
	}
	
	@Override
	public void ganhoAnual() {
		System.out.println("Assistente [nome=" + super.getNome() + ", salario=" + super.getGanhoAnual() + "]");
	}
	
	Assistente obter() {
		return new Assistente();
	}
	
}
