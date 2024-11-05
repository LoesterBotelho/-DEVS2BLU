package br.com.exemplo.factory.exercicio01.model;

public class Word implements Documento{

	@Override
	public void abrir() {
		System.out.println("Abrindo documento : Word");
	}

}
