package br.com.exemplo.factory.contabil.model;

public class Liquidacao implements Documento{

	@Override
	public void contabilizar() {
		System.out.println("CONTABILIZANDO : LIQUIDAÇÃO");
	}

}
