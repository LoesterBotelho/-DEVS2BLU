package devs2blu.loester.gof.criacionais.factory;

public class MainFactory {
	public static void main(String[] args) {
		
		TransporteFactory carroFactory = new CarroFactory();
		carroFactory.fazerEntrega();

		TransporteFactory bicicletaFactory = new BicicletaFactory();
		bicicletaFactory.fazerEntrega();
		
	}
}
