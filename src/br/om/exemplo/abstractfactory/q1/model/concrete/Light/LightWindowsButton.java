package br.om.exemplo.abstractfactory.q1.model.concrete.Light;

import br.om.exemplo.abstractfactory.q1.model.Button;

public class LightWindowsButton implements Button {
	 @Override
	 public void paint() {
	     System.out.println("WINDOWS BUTTON - LIGHT THEME");
	 }
	}
