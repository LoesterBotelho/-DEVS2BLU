package br.om.exemplo.abstractfactory.q1.factory;

import br.om.exemplo.abstractfactory.q1.model.Button;
import br.om.exemplo.abstractfactory.q1.model.CheckBox;
import br.om.exemplo.abstractfactory.q1.model.Label;
import br.om.exemplo.abstractfactory.q1.model.Textbox;

public interface GuiAbstractFactory {
	Label createLabel();
	Textbox createTextbox();
    Button createButton();
    CheckBox createCheckbox();
}
