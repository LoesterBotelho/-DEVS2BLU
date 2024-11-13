package br.com.exemplo.abstractfactory;

import br.com.exemplo.abstractfactory.factory.AppleFactory;
import br.com.exemplo.abstractfactory.factory.DeviceFactory;
import br.com.exemplo.abstractfactory.factory.SamsungFactory;
import br.com.exemplo.abstractfactory.model.Phone;
import br.com.exemplo.abstractfactory.model.Tablet;

public class MainMenu {
	public static void main(String[] args) {

		DeviceFactory appleFactory = new AppleFactory();
		Phone applePhone = appleFactory.createPhone();
		Tablet appleTablet = appleFactory.createTablet();
		applePhone.display();
		appleTablet.display();

		DeviceFactory samsungFactory = new SamsungFactory();
		Phone samsungPhone = samsungFactory.createPhone();
		Tablet samsungTablet = samsungFactory.createTablet();
		samsungPhone.display();
		samsungTablet.display();
		
	}
}
