package br.com.exemplo.factory.contabil.model;

public class Empenho implements Documento{

	@Override
	public void contabilizar() {
		System.out.println("CONTABILIZANDO : EMPENHO");
	}

}
