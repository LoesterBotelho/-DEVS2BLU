package br.om.exemplo.abstractfactory.q1;

import br.om.exemplo.abstractfactory.q1.factory.GuiAbstractFactory;
import br.om.exemplo.abstractfactory.q1.model.Button;
import br.om.exemplo.abstractfactory.q1.model.CheckBox;
import br.om.exemplo.abstractfactory.q1.model.Label;
import br.om.exemplo.abstractfactory.q1.model.Textbox;

public class ClientApplication {
	private Label label;
	private Textbox textbox;
    private Button button;
    private CheckBox checkbox;
    
	public ClientApplication(GuiAbstractFactory factory) {
		label = factory.createLabel();
		textbox = factory.createTextbox();
        button = factory.createButton();
        checkbox = factory.createCheckbox();		
	}
	
	public void paint() {
		label.paint();
		textbox.paint();
        button.paint();
        checkbox.paint();
	}
	
	
}
