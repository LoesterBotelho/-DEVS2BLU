package br.om.exemplo.abstractfactory.q1.factory;

import br.om.exemplo.abstractfactory.q1.model.Button;
import br.om.exemplo.abstractfactory.q1.model.CheckBox;
import br.om.exemplo.abstractfactory.q1.model.Label;
import br.om.exemplo.abstractfactory.q1.model.Textbox;
import br.om.exemplo.abstractfactory.q1.model.concrete.Light.LightLinuxButton;
import br.om.exemplo.abstractfactory.q1.model.concrete.Light.LightLinuxCheckBox;
import br.om.exemplo.abstractfactory.q1.model.concrete.Light.LightLinuxLabel;
import br.om.exemplo.abstractfactory.q1.model.concrete.Light.LightLinuxTextbox;

public class LightLinuxAbstractFactory implements GuiAbstractFactory  {

	@Override
	public Label createLabel() {
		return new LightLinuxLabel();
	}

	@Override
	public Textbox createTextbox() {
		return new LightLinuxTextbox();
	}

	@Override
	public Button createButton() {
		return new LightLinuxButton();
	}

	@Override
	public CheckBox createCheckbox() {
		return new LightLinuxCheckBox();
	}
	
}
