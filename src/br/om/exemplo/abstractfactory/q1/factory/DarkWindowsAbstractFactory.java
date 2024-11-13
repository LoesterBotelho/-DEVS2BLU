package br.om.exemplo.abstractfactory.q1.factory;

import br.om.exemplo.abstractfactory.q1.model.Button;
import br.om.exemplo.abstractfactory.q1.model.CheckBox;
import br.om.exemplo.abstractfactory.q1.model.Label;
import br.om.exemplo.abstractfactory.q1.model.Textbox;
import br.om.exemplo.abstractfactory.q1.model.concrete.Dark.DarkWindowsButton;
import br.om.exemplo.abstractfactory.q1.model.concrete.Dark.DarkWindowsCheckBox;
import br.om.exemplo.abstractfactory.q1.model.concrete.Dark.DarkWindowsLabel;
import br.om.exemplo.abstractfactory.q1.model.concrete.Dark.DarkWindowsTextbox;

public class DarkWindowsAbstractFactory implements GuiAbstractFactory {

	@Override
	public Label createLabel() {
		return new DarkWindowsLabel();
	}

	@Override
	public Textbox createTextbox() {
		return new DarkWindowsTextbox();
	}

	@Override
	public Button createButton() {
		return new DarkWindowsButton();
	}

	@Override
	public CheckBox createCheckbox() {
		return new DarkWindowsCheckBox();
	}

}
