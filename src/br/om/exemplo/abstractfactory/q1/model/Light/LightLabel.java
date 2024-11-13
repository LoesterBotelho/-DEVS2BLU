package br.om.exemplo.abstractfactory.q1.model.Light;

import br.om.exemplo.abstractfactory.q1.model.Label;

public class LightLabel implements Label {
	@Override
	public void paint() {
		System.out.println("Label com tema Claro");
	}
}