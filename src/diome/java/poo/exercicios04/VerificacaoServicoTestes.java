package diome.java.poo.exercicios04;

public class VerificacaoServicoTestes {
	public static void main(String[] args) {


		Teste teste01 = new Teste("movel,banda larga,tv","Combo Completo");
		Teste teste02 = new Teste("movel,tv","Combo Incompleto");
		Teste teste03 = new Teste("banda larga,tv,movel","Combo Completo");	

		
		teste01.validar();
		teste02.validar();
		teste03.validar();
		
	}
}
