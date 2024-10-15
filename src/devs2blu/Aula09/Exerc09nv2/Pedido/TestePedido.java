/*
 * Autor : Loester Franco Botelho - JAVA
 */


package devs2blu.Aula09.Exerc09nv2.Pedido;

public class TestePedido {

	public static void main(String[] args) {

		imprimirAutor();
		
		Cliente loester = new Cliente(1, "Loester", "12345678911");
		
		Endereco enderecoLoester = new Endereco(loester, "Av. Brasil, 610 - Ponta Aguda, Blumenau - SC, 89050-000");
		
		Pedido pedido = new Pedido(loester,enderecoLoester, 100000.0); 
		
		NotaFiscal notaFiscal = new NotaFiscal(pedido, enderecoLoester);
		
		System.out.println( loester.toString() );
		System.out.println( enderecoLoester.toString() );
		System.out.println( pedido.toString() );
		System.out.println( notaFiscal.toString() );
	
		pedido.enviarPedido();	
		notaFiscal.gerarNotaFiscal();
	}
	
	public static void imprimirAutor() {
		System.out.printf("Autor : Loester Botelho - Java \n");
		System.out.printf("............................................ \n");
	} 	
}
