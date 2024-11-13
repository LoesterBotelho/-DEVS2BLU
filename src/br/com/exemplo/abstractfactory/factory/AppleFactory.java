package br.com.exemplo.abstractfactory.factory;

import br.com.exemplo.abstractfactory.model.Phone;
import br.com.exemplo.abstractfactory.model.Tablet;
import br.com.exemplo.abstractfactory.model.concrete.iPad;
import br.com.exemplo.abstractfactory.model.concrete.iPhone;

public class AppleFactory implements DeviceFactory {
	@Override
	public Phone createPhone() {
		return new iPhone();
	}

	@Override
	public Tablet createTablet() {
		return new iPad();
	}
}