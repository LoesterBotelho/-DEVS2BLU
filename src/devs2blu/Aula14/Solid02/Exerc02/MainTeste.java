package devs2blu.Aula14.Solid02.Exerc02;

public class MainTeste {

	public static void main(String[] args) {

			Autenticacao autenticacao01 = new AutenticacaoPorBiometria();
			autenticacao01.autenticar();
			
			System.out.println("");
			
			Autenticacao autenticacao02 = new AutenticacaoPorEmail();
			autenticacao02.autenticar();
	}
}
