package br.om.exemplo.abstractfactory.q1.model.Light;

import br.om.exemplo.abstractfactory.q1.model.Textbox;

public class LightTextbox implements Textbox{
	@Override
	public void paint() {
		System.out.println("Textbox com tema Claro");
	}
}