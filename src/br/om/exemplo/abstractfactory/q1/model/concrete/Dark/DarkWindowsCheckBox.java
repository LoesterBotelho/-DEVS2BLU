package br.om.exemplo.abstractfactory.q1.model.concrete.Dark;

import br.om.exemplo.abstractfactory.q1.model.CheckBox;

public class DarkWindowsCheckBox implements CheckBox {
	 @Override
	 public void paint() {
	     System.out.println("WINDOWS CHECKBOX - DARK THEME");
	 }
	}