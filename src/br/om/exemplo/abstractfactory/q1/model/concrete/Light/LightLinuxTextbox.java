package br.om.exemplo.abstractfactory.q1.model.concrete.Light;

import br.om.exemplo.abstractfactory.q1.model.Textbox;

public class LightLinuxTextbox implements Textbox {

	@Override
	public void paint() {
		System.out.println("LINUX TEXTBOX - LIGHT THEME");
	}
	
}
