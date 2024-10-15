/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc09nv2.Celular;

public class BateriaImpl implements Bateria {

	private final int capacidade;
	private int nivelCarga;

	public BateriaImpl(int capacidade) {
	        this.capacidade = capacidade;
	        this.nivelCarga = capacidade;
	    }

	@Override
	public void ligar() {
		if (estaCarregada()) {
			System.out.println("A bateria está ligada.");
		} else {
			System.out.println("A bateria está descarregada.");
		}
	}

	@Override
	public boolean estaCarregada() {
		return nivelCarga > 0;
	}

	public void descarregar(int quantidade) {
		nivelCarga -= quantidade;
		if (nivelCarga < 0) {
			nivelCarga = 0;
		}
	}

	public void carregar() {
		nivelCarga = capacidade;
		System.out.println("Bateria recarregada.");
	}

}
