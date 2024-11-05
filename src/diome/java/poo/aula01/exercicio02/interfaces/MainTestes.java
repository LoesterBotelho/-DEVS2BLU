package diome.java.poo.aula01.exercicio02.interfaces;

import diome.java.poo.aula01.exercicio02.interfaces.interfaces.Copiar;
import diome.java.poo.aula01.exercicio02.interfaces.interfaces.Digitalizar;
import diome.java.poo.aula01.exercicio02.interfaces.interfaces.Imprimir;

public class MainTestes {
	public static void main(String[] args) {
		
/* Implemente usando interfaces : 		
		Impressora que só imprime: HP LaserJet Pro MFP M428fdw
		Impressora que só digitaliza: Canon CanoScan LiDE 300
		Impressora que faz somente xerox: Xerox WorkCentre 6515
		Impressora multifuncional		
*/	
		
		
		Imprimir impressoraHPLaserJetProMFPM428fdw = new ImpressoraImpl();
		impressoraHPLaserJetProMFPM428fdw.imprimir();
				
		Digitalizar copiadoraCanonCanoScanLiDE300 = new DigitalizadoraImpl();
		copiadoraCanonCanoScanLiDE300.digitalizar();
		
		Copiar imprimirXeroxWorkCentre6515 = new CopiadoraImpl();
		imprimirXeroxWorkCentre6515.copiar();
		
		
		ImpressoraMultiFuncionalImpl impressoraMultiFuncional = new ImpressoraMultiFuncionalImpl();
		impressoraMultiFuncional.copiar();
		impressoraMultiFuncional.digitalizar();
		impressoraMultiFuncional.imprimir();
	}
}
