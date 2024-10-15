package devs2blu.ifelseswitch;

public class Exercicio02 {
	public static void main(String[] args) {

		Double nota = 3.0;

		if (nota >= 9) {
			System.out.println("Parabens aluno de excelencia.");
		} else if (nota >= 7) {
			System.out.println("Aprovado");
		} else if (nota >= 4) {
			System.out.println("Exame");
		} else {
			System.out.println("Reprovado");
		}

	}
}
