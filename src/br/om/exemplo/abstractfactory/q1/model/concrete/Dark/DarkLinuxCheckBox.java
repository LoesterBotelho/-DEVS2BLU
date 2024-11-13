package br.om.exemplo.abstractfactory.q1.model.concrete.Dark;

import br.om.exemplo.abstractfactory.q1.model.CheckBox;

public class DarkLinuxCheckBox implements CheckBox{
	 @Override
	 public void paint() {
	     System.out.println("LINUX CHECKBOX - DARK THEME");
	 }
}
