package br.om.exemplo.abstractfactory.q1.model.Light;

import br.om.exemplo.abstractfactory.q1.model.CheckBox;

public class LightCheckBox implements CheckBox{
	@Override
	public void paint() {
		System.out.println("CheckBox com tema Claro");
	}
}