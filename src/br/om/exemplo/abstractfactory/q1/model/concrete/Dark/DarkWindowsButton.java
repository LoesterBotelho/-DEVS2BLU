package br.om.exemplo.abstractfactory.q1.model.concrete.Dark;

import br.om.exemplo.abstractfactory.q1.model.Button;

public class DarkWindowsButton implements Button {
	 @Override
	 public void paint() {
	     System.out.println("WINDOWS BUTTON - DARK THEME");
	 }
	}
