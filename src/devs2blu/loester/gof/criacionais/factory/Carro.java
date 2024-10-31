package devs2blu.loester.gof.criacionais.factory;

public class Carro implements Transporte {
	@Override
	public void entregar() {
		System.out.println("Entrega por carro.");
	}
}