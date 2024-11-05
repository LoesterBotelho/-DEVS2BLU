package br.com.exemplo.factory3.model;

public class Moto implements Transporte{

	@Override
	public void entregar() {
		System.out.println("Entrega por moto.");
	}

}
