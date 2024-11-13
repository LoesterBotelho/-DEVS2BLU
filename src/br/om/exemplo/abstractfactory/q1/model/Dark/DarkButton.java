package br.om.exemplo.abstractfactory.q1.model.Dark;

import br.om.exemplo.abstractfactory.q1.model.Button;

public class DarkButton implements Button {
    @Override
    public void paint() {
        System.out.println("Button com tema Escuro");
    }
}