package br.com.exemplo.abstractfactory.model.concrete;

import br.com.exemplo.abstractfactory.model.Phone;

public class iPhone implements Phone {
	@Override
	public void display() {
		System.out.println("This is an iPhone.");
	}
}