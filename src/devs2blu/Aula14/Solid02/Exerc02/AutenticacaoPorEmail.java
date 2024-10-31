package devs2blu.Aula14.Solid02.Exerc02;

public class AutenticacaoPorEmail implements Autenticacao{

	@Override
	public void autenticar() {
		System.out.println("AUTENTICAÇÃO : EMAIL");
	}

}
