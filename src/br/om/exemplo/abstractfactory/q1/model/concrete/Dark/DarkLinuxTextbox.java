package br.om.exemplo.abstractfactory.q1.model.concrete.Dark;

import br.om.exemplo.abstractfactory.q1.model.Textbox;

public class DarkLinuxTextbox implements Textbox {

	@Override
	public void paint() {
		System.out.println("LINUX TEXTBOX - DARK THEME");
	}
	
}
