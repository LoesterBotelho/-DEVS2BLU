package br.om.exemplo.abstractfactory.q1;

import br.om.exemplo.abstractfactory.q1.factory.DarkLinuxAbstractFactory;
import br.om.exemplo.abstractfactory.q1.factory.DarkMacAbstractFactory;
import br.om.exemplo.abstractfactory.q1.factory.DarkWindowsAbstractFactory;
import br.om.exemplo.abstractfactory.q1.factory.GuiAbstractFactory;
import br.om.exemplo.abstractfactory.q1.factory.LightLinuxAbstractFactory;
import br.om.exemplo.abstractfactory.q1.factory.LightMacAbstractFactory;
import br.om.exemplo.abstractfactory.q1.factory.LightWindowsAbstractFactory;

public class MainTeste {
	public static void main(String[] args) {
		

/*		
		// CHAMAR FUNÇÃO 1 POR VEZ
		String thema = "Light";
		// String thema = "Dark";
		String osName = System.getProperty("os.name").toLowerCase();
		chamarAbstractFactory(osName, thema);
*/
		
	String[] sistemaOperacionais = {"win","mac","linux","win","mac","linux"};
	String[] temas = {"Light","Light","Light","Dark","Dark","Dark"};
	
		for (var i=0 ; i < sistemaOperacionais.length ; i++) {
			
			chamarAbstractFactory( sistemaOperacionais[i] , temas[i] );
		}

	}
	
	public static void chamarAbstractFactory(String osName, String thema) {
		
		GuiAbstractFactory factory = null;	
		
		if (thema.equals("Light")) {
			if ( osName.contains("win") ) {
				factory = new LightWindowsAbstractFactory();	
			} else if ( osName.contains("mac") ) {
				factory = new LightMacAbstractFactory();
			} else if ( osName.contains("linux") ) {
				factory = new LightLinuxAbstractFactory();
			} else {
				System.out.println("Erro : Sistema Operacional desconhecido.");
			}
		} else {
			if ( osName.contains("win") ) {
				factory = new DarkWindowsAbstractFactory();	
			} else if ( osName.contains("mac") ) {
				factory = new DarkMacAbstractFactory();
			} else if ( osName.contains("linux") ) {
				factory = new DarkLinuxAbstractFactory();
			} else {
				System.out.println("Erro : Sistema Operacional desconhecido.");
			}
		}
		
        ClientApplication app = new ClientApplication(factory);
        
        app.paint();
	}
	
}
