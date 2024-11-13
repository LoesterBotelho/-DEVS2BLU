package br.om.exemplo.abstractfactory.q1.model.concrete.Light;

import br.om.exemplo.abstractfactory.q1.model.Label;

public class LightWindowsLabel implements Label {

	@Override
	public void paint() {
		System.out.println("WINDOWS LABEL - LIGHT THEME");
	}

}
