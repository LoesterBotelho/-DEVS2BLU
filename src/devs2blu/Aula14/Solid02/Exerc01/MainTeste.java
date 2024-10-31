package devs2blu.Aula14.Solid02.Exerc01;

public class MainTeste {
	public static void main(String[] args) {

		Armazenamento armazenamento01 = new ArquivoTexto();
		armazenamento01.salvar();
		
		System.out.println("");
		
		Armazenamento armazenamento02 = new BancoDados();
		armazenamento02.salvar();
	}
}
