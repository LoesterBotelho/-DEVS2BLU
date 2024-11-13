package br.com.exemplo.abstractfactory.model.concrete;

import br.com.exemplo.abstractfactory.model.Tablet;

public class SamsungTablet implements Tablet {
	@Override
	public void display() {
		System.out.println("This is a Samsung tablet.");
	}
}