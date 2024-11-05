package br.com.exemplo.factory.contabil.model;

public class Pagamento implements Documento{

	@Override
	public void contabilizar() {
		System.out.println("CONTABILIZANDO : PAGAMENTO");
	}

}
