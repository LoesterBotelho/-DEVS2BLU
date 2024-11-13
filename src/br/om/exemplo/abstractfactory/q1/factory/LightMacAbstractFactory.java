package br.om.exemplo.abstractfactory.q1.factory;

import br.om.exemplo.abstractfactory.q1.model.Button;
import br.om.exemplo.abstractfactory.q1.model.CheckBox;
import br.om.exemplo.abstractfactory.q1.model.Label;
import br.om.exemplo.abstractfactory.q1.model.Textbox;
import br.om.exemplo.abstractfactory.q1.model.concrete.Light.LightMacButton;
import br.om.exemplo.abstractfactory.q1.model.concrete.Light.LightMacCheckBox;
import br.om.exemplo.abstractfactory.q1.model.concrete.Light.LightMacLabel;
import br.om.exemplo.abstractfactory.q1.model.concrete.Light.LightMacTextbox;

public class LightMacAbstractFactory implements GuiAbstractFactory  {

	@Override
	public Label createLabel() {
		return new LightMacLabel();
	}

	@Override
	public Textbox createTextbox() {
		return new LightMacTextbox();
	}
	
	 @Override
	 public Button createButton() {
	     return new LightMacButton();
	 }

	 @Override
	 public CheckBox createCheckbox() {
	     return new LightMacCheckBox();
	 }
	
}
