package diome.java.poo.aula01.exercicio02.interfaces;

import diome.java.poo.aula01.exercicio02.interfaces.interfaces.Copiar;
import diome.java.poo.aula01.exercicio02.interfaces.interfaces.Digitalizar;
import diome.java.poo.aula01.exercicio02.interfaces.interfaces.Imprimir;

public class ImpressoraMultiFuncionalImpl implements Copiar , Digitalizar  , Imprimir{

	@Override
	public void imprimir() {
		System.out.println("imprimir");
	}

	@Override
	public void digitalizar() {
		System.out.println("digitalizar");
	}

	@Override
	public void copiar() {
		System.out.println("copiar");
	}

}
