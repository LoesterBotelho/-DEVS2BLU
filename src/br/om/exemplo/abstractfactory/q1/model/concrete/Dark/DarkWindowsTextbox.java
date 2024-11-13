package br.om.exemplo.abstractfactory.q1.model.concrete.Dark;

import br.om.exemplo.abstractfactory.q1.model.Textbox;

public class DarkWindowsTextbox implements Textbox {

	@Override
	public void paint() {
		System.out.println("WINDOWS TEXTBOX - DARK THEME");
	}

}
