package br.om.exemplo.abstractfactory.q1.model.Dark;

import br.om.exemplo.abstractfactory.q1.model.Textbox;

public class DarkTextbox implements Textbox {

	@Override
	public void paint() {
        System.out.println("Textbox com tema Escuro");
	}
	
}
