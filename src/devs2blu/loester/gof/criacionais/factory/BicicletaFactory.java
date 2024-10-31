package devs2blu.loester.gof.criacionais.factory;

public class BicicletaFactory extends TransporteFactory {
	@Override
	public Transporte criarTransporte() {
		return new Bicicleta();
	}
}