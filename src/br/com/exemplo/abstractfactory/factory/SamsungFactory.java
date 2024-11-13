package br.com.exemplo.abstractfactory.factory;

import br.com.exemplo.abstractfactory.model.Phone;
import br.com.exemplo.abstractfactory.model.Tablet;
import br.com.exemplo.abstractfactory.model.concrete.SamsungPhone;
import br.com.exemplo.abstractfactory.model.concrete.SamsungTablet;

public class SamsungFactory implements DeviceFactory {
	@Override
	public Phone createPhone() {
		return new SamsungPhone();
	}

	@Override
	public Tablet createTablet() {
		return new SamsungTablet();
	}
}
