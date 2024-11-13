package br.om.exemplo.abstractfactory.q1.model.concrete.Light;

import br.om.exemplo.abstractfactory.q1.model.Textbox;

public class LightWindowsTextbox implements Textbox {

	@Override
	public void paint() {
		System.out.println("WINDOWS TEXTBOX - LIGHT THEME");
	}

}
