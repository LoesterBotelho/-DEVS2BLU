package devs2blu.loester.gof.criacionais.factory;

public class Bicicleta implements Transporte {
	@Override
	public void entregar() {
		System.out.println("Entrega por bicicleta.");
	}
}