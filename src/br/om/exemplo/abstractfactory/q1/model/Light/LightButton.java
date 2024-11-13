package br.om.exemplo.abstractfactory.q1.model.Light;

import br.om.exemplo.abstractfactory.q1.model.Button;

public class LightButton implements Button {
	@Override
	public void paint() {
		System.out.println("Button com tema Claro");
	}
}