package br.om.exemplo.abstractfactory.q1.factory;

import br.om.exemplo.abstractfactory.q1.model.Button;
import br.om.exemplo.abstractfactory.q1.model.CheckBox;
import br.om.exemplo.abstractfactory.q1.model.Label;
import br.om.exemplo.abstractfactory.q1.model.Textbox;
import br.om.exemplo.abstractfactory.q1.model.concrete.Dark.DarkMacButton;
import br.om.exemplo.abstractfactory.q1.model.concrete.Dark.DarkMacCheckBox;
import br.om.exemplo.abstractfactory.q1.model.concrete.Dark.DarkMacLabel;
import br.om.exemplo.abstractfactory.q1.model.concrete.Dark.DarkMacTextbox;

public class DarkMacAbstractFactory implements GuiAbstractFactory  {

	@Override
	public Label createLabel() {
		return new DarkMacLabel();
	}

	@Override
	public Textbox createTextbox() {
		return new DarkMacTextbox();
	}
	
	 @Override
	 public Button createButton() {
	     return new DarkMacButton();
	 }

	 @Override
	 public CheckBox createCheckbox() {
	     return new DarkMacCheckBox();
	 }
	
}
