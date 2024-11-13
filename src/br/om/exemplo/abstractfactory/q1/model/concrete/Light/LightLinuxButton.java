package br.om.exemplo.abstractfactory.q1.model.concrete.Light;

import br.om.exemplo.abstractfactory.q1.model.Button;

public class LightLinuxButton implements Button{
	 @Override
	 public void paint() {
	     System.out.println("LINUX BUTTON - LIGHT THEME");
	 }
	}