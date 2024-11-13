package br.om.exemplo.abstractfactory.q1.model.concrete.Light;

import br.om.exemplo.abstractfactory.q1.model.Label;

public class LightLinuxLabel implements Label {

	@Override
	public void paint() {
		System.out.println("LINUX LABEL - LIGHT THEME");
	}
	
}
