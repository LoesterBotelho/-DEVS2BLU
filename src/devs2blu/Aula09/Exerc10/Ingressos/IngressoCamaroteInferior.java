/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc10.Ingressos;

public class IngressoCamaroteInferior extends Ingresso{

	public IngressoCamaroteInferior() {
		super();
		super.setValor(300.0);
		super.setValorAdicional(50.0);
		super.setLocalizacao("CAMAROTE NO PISO INFERIOR");
		super.setTipo("CAMAROTE_LOW");
	}

	@Override
	public String toString() {		
		return String.format("Ingresso Camarote Low [Tipo=%s, Valor=%s, ValorAdicional=%s, Localizacao=%s, ValorTotal=%s]\n"
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
