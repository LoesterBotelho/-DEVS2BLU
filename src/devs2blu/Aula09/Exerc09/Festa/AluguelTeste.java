/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc09.Festa;

public class AluguelTeste {

	public static void main(String[] args) {

		imprimirAutor();

		// LISTAS SIMPLES
		String[] listaItensCinderela = { "Castelo", "Boneca da Cinderela", "Carroagem de Abobora" };
		String[] listaItensBrancaDeNeve = { "Castelo", "Boneca da Branca de Neve", "Maça Gigante" };

		// TEMAS DISPONÍVEIS
		Tema temaCinderela = new Tema("Cinderela", 1000.0, listaItensCinderela, "Rosa");
		Tema temaBrancaDeNeve = new Tema("Branca de neve", 1500.0, listaItensBrancaDeNeve, "Azul");

		// CLIENTE - LOESTER
		Cliente clienteLoester = new Cliente("Loester", "(47) 99811-1111");

		ClienteEndereco clienteEnderecoLoester = new ClienteEndereco(clienteLoester,
				"Av. Brasil, 610 - Ponta Aguda, Blumenau - SC, 89050-000");

		// LOCAÇÃO 1 - DO LOESTER
		Festa festaLoester01 = new Festa("20/12/2024", "07:00", "23:00");

		Aluguel aluguelLoester01 = new Aluguel(clienteLoester, clienteEnderecoLoester, temaBrancaDeNeve,
				festaLoester01);

		aluguelLoester01.metodoContabilizarPagamento(1600.0);

		// LOCAÇÃO 2 - DO LOESTER

		Festa festaLoester02 = new Festa("25/12/2024", "08:00", "22:00");

		Aluguel aluguelLoester02 = new Aluguel(clienteLoester, clienteEnderecoLoester, temaCinderela, festaLoester02);

		aluguelLoester02.metodoContabilizarPagamento(1000.0);

		// CLIENTE - MARIA
				
		Cliente clienteMaria = new Cliente("Maria", "(47) 99777-2222");
			
		ClienteEndereco clienteEnderecoMaria = new ClienteEndereco(clienteMaria,
				"Av. Brasil, 610 - Ponta Aguda, Blumenau - SC, 89050-000");

		Festa festaMaria = new Festa("24/12/2024", "08:00", "23:00");

		Aluguel aluguelMaria = new Aluguel(clienteMaria, clienteEnderecoMaria, temaCinderela, festaMaria);

		aluguelMaria.metodoContabilizarPagamento(500.00);

	}

	public static void imprimirAutor() {
		System.out.printf("Autor : Loester Botelho - Java \n");
		System.out.printf("............................................ \n");
	}

}
