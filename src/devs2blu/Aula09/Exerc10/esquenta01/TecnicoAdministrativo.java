package devs2blu.Aula09.Exerc10.esquenta01;

public class TecnicoAdministrativo extends Assistente{

	private String turno;
	private Double adicionalNoturno;
	
	public TecnicoAdministrativo() {
		super();
	}

	
	public String getTurno() {
		return turno;
	}


	public void setTurno(String turno) {
		this.turno = turno;
	}


	public Double getAdicionalNoturno() {
		return adicionalNoturno;
	}


	public void setAdicionalNoturno(Double adicionalNoturno) {
		this.adicionalNoturno = adicionalNoturno;
	}


	@Override
	public String toString() {
		return "TecnicoAdministrativo [nome=" + super.getNome() + ", salario=" + super.getSalario() + "]";
	}

	@Override
	public void exibeDados() {
		System.out.println("TecnicoAdministrativo [nome=" + super.getNome() + ", salario=" + super.getSalario() + "]");
	}
	
	@Override
	public void ganhoAnual() {
		System.out.println("TecnicoAdministrativo [nome=" + super.getNome() + ", salario=" + super.getGanhoAnual() + "]");
	}
	
	TecnicoAdministrativo obter() {
		return new TecnicoAdministrativo();
	}
	
	
	
}
