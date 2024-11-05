package br.com.exemplo.factory3.model;

public class Carro implements Transporte{

	@Override
	public void entregar() {
		System.out.println("Entrega por carro.");
	}

}
