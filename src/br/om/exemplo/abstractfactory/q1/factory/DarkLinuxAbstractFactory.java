package br.om.exemplo.abstractfactory.q1.factory;

import br.om.exemplo.abstractfactory.q1.model.Button;
import br.om.exemplo.abstractfactory.q1.model.CheckBox;
import br.om.exemplo.abstractfactory.q1.model.Label;
import br.om.exemplo.abstractfactory.q1.model.Textbox;
import br.om.exemplo.abstractfactory.q1.model.concrete.Dark.DarkLinuxButton;
import br.om.exemplo.abstractfactory.q1.model.concrete.Dark.DarkLinuxCheckBox;
import br.om.exemplo.abstractfactory.q1.model.concrete.Dark.DarkLinuxLabel;
import br.om.exemplo.abstractfactory.q1.model.concrete.Dark.DarkLinuxTextbox;

public class DarkLinuxAbstractFactory implements GuiAbstractFactory  {

	@Override
	public Label createLabel() {
		return new DarkLinuxLabel();
	}

	@Override
	public Textbox createTextbox() {
		return new DarkLinuxTextbox();
	}

	@Override
	public Button createButton() {
		return new DarkLinuxButton();
	}

	@Override
	public CheckBox createCheckbox() {
		return new DarkLinuxCheckBox();
	}
	
}
