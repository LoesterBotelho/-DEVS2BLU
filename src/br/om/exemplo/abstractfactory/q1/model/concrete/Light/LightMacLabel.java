package br.om.exemplo.abstractfactory.q1.model.concrete.Light;

import br.om.exemplo.abstractfactory.q1.model.Label;

public class LightMacLabel implements Label {

	@Override
	public void paint() {
		System.out.println("MAC LABEL - LIGHT THEME");
	}
	
}
