package devs2blu.Aula10.Exerc10.Exer02.ImpostoDeRenda;

public class Aliquota {

	private Double rendaBruta;
	private Double aliquota;
	private Double parcelasADeduzir;
	
	public Aliquota(){
		
	}
	
	public Aliquota(Double rendaBruta, Double aliquota, Double parcelasADeduzir) {
		this.rendaBruta = rendaBruta;
		this.aliquota = aliquota;
		this.parcelasADeduzir = parcelasADeduzir;
	}

	public Double getRendaBruta() {
		return rendaBruta;
	}

	public void setRendaBruta(Double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}

	public Double getAliquota() {
		return aliquota;
	}

	public void setAliquota(Double aliquota) {
		this.aliquota = aliquota;
	}

	public Double getParcelasADeduzir() {
		return parcelasADeduzir;
	}

	public void setParcelasADeduzir(Double parcelasADeduzir) {
		this.parcelasADeduzir = parcelasADeduzir;
	}

	@Override
	public String toString() {
		return "Aliquota [rendaBruta=" + rendaBruta + ", aliquota=" + aliquota + ", parcelasADeduzir="
				+ parcelasADeduzir + "]";
	}
	
	
	
}
