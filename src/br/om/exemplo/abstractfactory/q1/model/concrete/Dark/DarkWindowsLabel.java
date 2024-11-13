package br.om.exemplo.abstractfactory.q1.model.concrete.Dark;

import br.om.exemplo.abstractfactory.q1.model.Label;

public class DarkWindowsLabel implements Label {

	@Override
	public void paint() {
		System.out.println("WINDOWS LABEL - DARK THEME");
	}

}
