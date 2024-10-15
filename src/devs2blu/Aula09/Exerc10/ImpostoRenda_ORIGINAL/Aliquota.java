/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc10.ImpostoRenda_ORIGINAL;

public class Aliquota extends AliquotaAbstrata{

	private Double rendaBrutaInicial = 0.0;
	private Double rendaBrutaFinal = 0.0;
	private Double aliquota = 0.0 ;
	private Double parcelaDeduzir = 0.0;
	
	
	public Aliquota() {
		this.setRendaBrutaInicial(0.0);
		this.setRendaBrutaInicial(0.0);
		this.setAliquota(0.0);
		this.setParcelaDeduzir(0.0);
	}
	
	public Aliquota(Double rendaBrutaInicial, Double rendaBrutaFinal, Double aliquota, Double parcelaDeduzir) {		
		this.setRendaBrutaInicial(rendaBrutaInicial);
		this.setRendaBrutaFinal(rendaBrutaFinal);
		this.setAliquota(aliquota);
		this.setParcelaDeduzir(parcelaDeduzir);
	}

	public Double getRendaBrutaInicial() {
	    return (rendaBrutaInicial != null) ? rendaBrutaInicial : 0.0;
	}

	public void setRendaBrutaInicial(Double rendaBrutaInicial) {
	    this.rendaBrutaInicial = (rendaBrutaInicial != null) ? rendaBrutaInicial : 0.0;
	}

	public Double getRendaBrutaFinal() {
	    return (rendaBrutaFinal != null) ? rendaBrutaFinal : 0.0;
	}

	public void setRendaBrutaFinal(Double rendaBrutaFinal) {
	    this.rendaBrutaFinal = (rendaBrutaFinal != null) ? rendaBrutaFinal : 0.0;
	}

	public Double getAliquota() {
	    return (aliquota != null) ? aliquota : 0.0;
	}

	public void setAliquota(Double aliquota) {
	    this.aliquota = (aliquota != null) ? aliquota : 0.0;
	}

	public Double getParcelaDeduzir() {
	    return (parcelaDeduzir != null) ? parcelaDeduzir : 0.0;
	}

	public void setParcelaDeduzir(Double parcelaDeduzir) {
	    this.parcelaDeduzir = (parcelaDeduzir != null) ? parcelaDeduzir : 0.0;
	}
	
	@Override
	public String toString() {
		return String.format("Aliquota [rendaBrutaInicial=%s, rendaBrutaFinal=%s, aliquota=%s, parcelaDeduzir=%s]"
				, this.getRendaBrutaInicial()
				, this.getRendaBrutaFinal()
				, this.getAliquota()
				, this.getParcelaDeduzir()
							);
	}

	@Override
	void mostrarAliquota() {
		System.out.printf( "%s" , this.toString() );		
	}
		
}
