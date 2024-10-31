package devs2blu.Aula13.Exerc02;

public class MainTeste {
	public static void main(String[] args) {

		Exame exmSangue = new ExameSangue();		
		exmSangue.realizarExame();
		
		Exame exmUrina = new ExameUrina();
		exmUrina.realizarExame();
		
		Exame exmCovid = new ExameCovid();
		exmCovid.realizarExame();
		
		
	}
}
