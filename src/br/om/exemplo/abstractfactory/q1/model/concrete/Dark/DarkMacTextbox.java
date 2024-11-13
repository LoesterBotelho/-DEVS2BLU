package br.om.exemplo.abstractfactory.q1.model.concrete.Dark;

import br.om.exemplo.abstractfactory.q1.model.Textbox;

public class DarkMacTextbox implements Textbox{

	@Override
	public void paint() {
		System.out.println("MAC TEXTBOX - DARK THEME");
	}
	
}
