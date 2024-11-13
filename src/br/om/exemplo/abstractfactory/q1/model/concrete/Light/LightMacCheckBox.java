package br.om.exemplo.abstractfactory.q1.model.concrete.Light;

import br.om.exemplo.abstractfactory.q1.model.CheckBox;

public class LightMacCheckBox implements CheckBox {
	 @Override
	 public void paint() {
	     System.out.println("MAC CHECKBOX - LIGHT THEME");
	 }
	}