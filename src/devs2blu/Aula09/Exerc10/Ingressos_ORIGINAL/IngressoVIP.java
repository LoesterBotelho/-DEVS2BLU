/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc10.Ingressos_ORIGINAL;

public class IngressoVIP extends Ingresso {

	public IngressoVIP() {
		super();
		super.setValor(200.0);
		super.setValorAdicional(50.0);
		super.setLocalizacao("SALA VIP");
		super.setTipo("VIP");
	}

	@Override
	public String toString() {		
		return String.format("Ingresso VIP [Tipo=%s, Valor=%s, ValorAdicional=%s, Localizacao=%s, ValorTotal=%s]\n"
							, super.getTipo()
							, super.getValor()
							, super.getLocalizacao()
							, super.getValorAdicional()
							, super.getValorTotal()							
							);
	}
	
	@Override
	public void mostrar() {
		System.out.printf( "%s \n", this.toString() );
	}	
}
