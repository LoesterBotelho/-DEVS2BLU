/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc09nv2.Celular;

public class CelularImpl implements Celular {

	private final Bateria bateria;

	public CelularImpl(Bateria bateria) {
		this.bateria = bateria;
	}

	@Override
	public void ligar() {
		bateria.ligar();
	}

	@Override
	public void usarCelular(int uso) {
		if (bateria.estaCarregada()) {
			System.out.println("Usando o celular...");
			((Bateria) bateria).descarregar(uso);
		} else {
			System.out.println("Não é possível usar o celular. A bateria está descarregada.");
		}
	}
}
