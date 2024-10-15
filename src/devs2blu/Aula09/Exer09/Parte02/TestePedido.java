package devs2blu.Aula09.Exer09.Parte02;

public class TestePedido {

	public static void main(String[] args) {

		Produto prdBanana = new Produto("Banana",5.5);
		Produto prdMaca = new Produto("Maça",8.5);
		Produto prdMorango = new Produto("Morango",17.0);
		
		PedidoItens pei01 = new PedidoItens(prdBanana, 100.0, 5.5);
		PedidoItens pei02 = new PedidoItens(prdMaca, 100.0, 8.5);
		PedidoItens pei03 = new PedidoItens(prdMorango, 100.0, 17.0);
		
		PedidoItens[] lista = {pei01, pei02, pei03};
		
		Pedido pedido001 = new Pedido(lista);
		
		System.out.printf( "%s", pedido001.toString() ); 
		
		
		
		
		
		
	}

}
