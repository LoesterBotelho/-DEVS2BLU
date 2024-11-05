package br.com.exemplo.factory3.factory;

import br.com.exemplo.factory3.model.Moto;
import br.com.exemplo.factory3.model.Transporte;

public class MotoFactory extends TransporteFactory {
	@Override
	public Transporte criarTransporte() {
		return new Moto();
	}
}