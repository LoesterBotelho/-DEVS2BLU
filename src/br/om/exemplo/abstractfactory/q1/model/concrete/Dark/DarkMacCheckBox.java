package br.om.exemplo.abstractfactory.q1.model.concrete.Dark;

import br.om.exemplo.abstractfactory.q1.model.CheckBox;

public class DarkMacCheckBox implements CheckBox {
	 @Override
	 public void paint() {
	     System.out.println("MAC CHECKBOX - DARK THEME");
	 }
	}