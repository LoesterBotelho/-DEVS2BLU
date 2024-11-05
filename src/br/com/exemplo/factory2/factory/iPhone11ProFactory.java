package br.com.exemplo.factory2.factory;

import br.com.exemplo.factory2.model.iPhone;
import br.com.exemplo.factory2.model.iPhone11Pro;

public class iPhone11ProFactory extends iPhoneFactory {
	@Override
	public iPhone createiPhone() {
		return new iPhone11Pro();
	}
}