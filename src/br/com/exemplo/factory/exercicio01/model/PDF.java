package br.com.exemplo.factory.exercicio01.model;

public class PDF implements Documento{

	@Override
	public void abrir() {
		System.out.println("Abrindo documento : PDF");
	}

}
