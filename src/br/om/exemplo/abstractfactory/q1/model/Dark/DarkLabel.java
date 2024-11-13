package br.om.exemplo.abstractfactory.q1.model.Dark;

import br.om.exemplo.abstractfactory.q1.model.Label;

public class DarkLabel implements Label{

	@Override
	public void paint() {
        System.out.println("Label com tema Escuro");		
	}
	
}
