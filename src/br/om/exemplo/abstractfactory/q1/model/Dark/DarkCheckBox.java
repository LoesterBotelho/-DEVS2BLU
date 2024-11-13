package br.om.exemplo.abstractfactory.q1.model.Dark;

import br.om.exemplo.abstractfactory.q1.model.CheckBox;

public class DarkCheckBox implements CheckBox {

	@Override
	public void paint() {
        System.out.println("CheckBox com tema Escuro");
	}	
}