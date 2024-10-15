/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc10.Ingressos;

public class IngressoCamaroteSuperior extends Ingresso{

	public IngressoCamaroteSuperior() {
		super();
		super.setValor(500.0);
		super.setValorAdicional(50.0);
		super.setLocalizacao("CAMAROTE NO PISO SUPERIOR");
		super.setTipo("CAMAROTE_PREMIUM");
	}

	@Override
	public String toString() {		
		return String.format("Ingresso Camarote Premium [Tipo=%s, Valor=%s, ValorAdicional=%s, Localizacao=%s, ValorTotal=%s]\n"
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
