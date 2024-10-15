package devs2blu.Aula09.Exerc10.esquenta01;

public class Teste {

	public static void main(String[] args) {

		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Leandro");
		funcionario.setSalario(1000.0);
		
		
		
		Assistente assistente = new Assistente();
		assistente.setNumeroMatricula("187497");
		assistente.setNome("Antonio");
		assistente.setSalario(2000.0);
		
		
		TecnicoAdministrativo tecnicoAdministrativo = new TecnicoAdministrativo();
		assistente.setNumeroMatricula("187497");
		tecnicoAdministrativo.setNome("lisa");
		tecnicoAdministrativo.setSalario(3000.0);
		
		
		funcionario.exibeDados();
		assistente.exibeDados();
		tecnicoAdministrativo.exibeDados();
		
		funcionario.ganhoAnual();
		assistente.ganhoAnual();
		tecnicoAdministrativo.ganhoAnual();

	}
}
