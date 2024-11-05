package br.com.exemplo.factory3.factory;

import br.com.exemplo.factory3.model.Bicicleta;
import br.com.exemplo.factory3.model.Transporte;

public class BicicletaFactory extends TransporteFactory {
	@Override
	public Transporte criarTransporte() {
		return new Bicicleta();
	}
}