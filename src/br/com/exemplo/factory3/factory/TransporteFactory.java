package br.com.exemplo.factory3.factory;

import br.com.exemplo.factory3.model.Transporte;

public abstract class TransporteFactory {
	public abstract Transporte criarTransporte();

	public void fazerEntrega() {
		Transporte transporte = criarTransporte();
		transporte.entregar();
	}

}
