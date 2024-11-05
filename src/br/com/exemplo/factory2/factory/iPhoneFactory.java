package br.com.exemplo.factory2.factory;

import br.com.exemplo.factory2.model.iPhone;

public abstract class iPhoneFactory {
	public abstract iPhone createiPhone();

	public void showiPhone() {
		iPhone iphone = createiPhone();
		iphone.display();
	}
}