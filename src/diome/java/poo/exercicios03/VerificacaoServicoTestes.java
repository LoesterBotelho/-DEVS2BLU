package diome.java.poo.exercicios03;

public class VerificacaoServicoTestes {
	public static void main(String[] args) {


		Teste teste01 = new Teste("movel","Alice,movel,fixa","Sim");
		Teste teste02 = new Teste("fixa","Bob,movel,tv","Nao");
		Teste teste03 = new Teste("tv","Carol,movel,fixa,tv","Sim");
		Teste teste04 = new Teste("smartphone","Carol,movel,fixa,smartphone","Sim");

		
		teste01.validar();
		teste02.validar();
		teste03.validar();
		teste04.validar();
	}
}
