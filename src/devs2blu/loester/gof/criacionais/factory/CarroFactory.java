package devs2blu.loester.gof.criacionais.factory;

public class CarroFactory extends TransporteFactory {
	@Override
	public Transporte criarTransporte() {
		return new Carro();
	}
}