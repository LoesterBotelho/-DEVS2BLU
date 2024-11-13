package br.om.exemplo.abstractfactory.q1.model.concrete.Dark;

import br.om.exemplo.abstractfactory.q1.model.Button;

public class DarkLinuxButton implements Button{
	 @Override
	 public void paint() {
	     System.out.println("LINUX BUTTON - DARK THEME");
	 }
	}