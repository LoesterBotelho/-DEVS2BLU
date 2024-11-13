package br.com.exemplo.abstractfactory.model.concrete;

import br.com.exemplo.abstractfactory.model.Phone;

public class SamsungPhone implements Phone {
	@Override
	public void display() {
		System.out.println("This is a Samsung phone.");
	}
}