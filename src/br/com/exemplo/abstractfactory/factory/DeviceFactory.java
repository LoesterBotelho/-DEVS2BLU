package br.com.exemplo.abstractfactory.factory;

import br.com.exemplo.abstractfactory.model.Phone;
import br.com.exemplo.abstractfactory.model.Tablet;

public interface DeviceFactory {
	Phone createPhone();
	Tablet createTablet();
}