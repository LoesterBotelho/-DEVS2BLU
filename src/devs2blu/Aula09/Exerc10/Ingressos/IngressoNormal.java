/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc10.Ingressos;

public class IngressoNormal extends Ingresso{
	
	public IngressoNormal() {
		super();
		super.setValor(100.0);
		super.setValorAdicional(50.0);
		super.setLocalizacao("SALA NORMAL");
		super.setTipo("NORMAL");
	}

	@Override
	public String toString() {		
		return String.format("Ingresso Normal [Tipo=%s, Valor=%s, ValorAdicional=%s, Localizacao=%s, ValorTotal=%s]\n"
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
