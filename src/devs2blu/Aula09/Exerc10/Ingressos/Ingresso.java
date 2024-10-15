/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc10.Ingressos;

public abstract class Ingresso extends IngressoAbstrato{

	private Double valor = 0.0;
	private Double valorAdicional = 0.0;
	private String localizacao = "";
	private String tipo = "";
	
	
	public Ingresso() {
		this.setValor(0.0);
		this.setLocalizacao("");
		this.setValorAdicional(0.0);
		this.setTipo("");
	}
	
	public Ingresso(Double valor, Double valorAdicional, String localizacao) {
		super();
		this.setValor(valor);
		this.setValorAdicional(valorAdicional);
		this.setLocalizacao(localizacao);
		this.setTipo("");
	}

	public Ingresso(Double valor, Double valorAdicional, String localizacao, String tipo) {
		super();
		this.setValor(valor);
		this.setValorAdicional(valorAdicional);
		this.setLocalizacao(localizacao);
		this.setTipo(tipo);
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public Double getValor() {
	    return valor != null ? valor : 0.0;
	}

	public void setValor(Double valor) {
	    this.valor = valor;
	}

	public Double getValorAdicional() {
	    return valorAdicional != null ? valorAdicional : 0.0;
	}

	public void setValorAdicional(Double valorAdicional) {
	    this.valorAdicional = valorAdicional;
	}


	public String getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public Double getValorTotal() {
	    Double valor = this.getValor() != null ? this.getValor() : 0.0;
	    Double valorAdicional = this.getValorAdicional() != null ? this.getValorAdicional() : 0.0;
	    return valor + valorAdicional;
	}
	
	@Override
	public String toString() {
		return String.format("Ingresso [valor=%s, valorAdicional=%s, localizacao=%s]"
							, this.getValor()
							, this.getValorAdicional()
							, this.getLocalizacao()
							);
	}
	
	@Override
	public void mostrar() {
		System.out.printf( "%s \n", this.toString() );
	}
	
	@Override
	public void imprimeValor() {
		System.out.printf( "%s\n", this.getValor() );
	}

	@Override
	public void imprimeTipo() {
		System.out.printf( "%s\n", this.getTipo() );
	}

	@Override
	public void valorTotal() {
		System.out.printf( "%s\n", this.getValorTotal().toString() );
	}	
}
