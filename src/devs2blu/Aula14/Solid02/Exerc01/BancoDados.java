package devs2blu.Aula14.Solid02.Exerc01;

public class BancoDados implements Armazenamento{

	@Override
	public void salvar() {
		System.out.println("ARMAZENAMENTO : BANCO DE DADOS");
	}

}
