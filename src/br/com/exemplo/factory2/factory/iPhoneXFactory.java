package br.com.exemplo.factory2.factory;

import br.com.exemplo.factory2.model.iPhone;
import br.com.exemplo.factory2.model.iPhoneX;

public class iPhoneXFactory extends iPhoneFactory {
	@Override
	public iPhone createiPhone() {
		return new iPhoneX();
	}
}