package br.com.exemplo.factory3.factory;

import br.com.exemplo.factory3.model.Carro;
import br.com.exemplo.factory3.model.Transporte;

public class CarroFactory extends TransporteFactory {
	@Override
	public Transporte criarTransporte() {
		return new Carro();
	}
}