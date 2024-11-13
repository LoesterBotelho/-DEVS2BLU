package br.om.exemplo.abstractfactory.q1.factory;

import br.om.exemplo.abstractfactory.q1.model.Button;
import br.om.exemplo.abstractfactory.q1.model.CheckBox;
import br.om.exemplo.abstractfactory.q1.model.Label;
import br.om.exemplo.abstractfactory.q1.model.Textbox;
import br.om.exemplo.abstractfactory.q1.model.concrete.Light.LightWindowsButton;
import br.om.exemplo.abstractfactory.q1.model.concrete.Light.LightWindowsCheckBox;
import br.om.exemplo.abstractfactory.q1.model.concrete.Light.LightWindowsLabel;
import br.om.exemplo.abstractfactory.q1.model.concrete.Light.LightWindowsTextbox;

public class LightWindowsAbstractFactory implements GuiAbstractFactory {

	@Override
	public Label createLabel() {
		return new LightWindowsLabel();
	}

	@Override
	public Textbox createTextbox() {
		return new LightWindowsTextbox();
	}

	@Override
	public Button createButton() {
		return new LightWindowsButton();
	}

	@Override
	public CheckBox createCheckbox() {
		return new LightWindowsCheckBox();
	}

}
