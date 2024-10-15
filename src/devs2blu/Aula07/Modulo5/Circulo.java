package devs2blu.Aula07.Modulo5;

public class Circulo {

	private Double raio;
	private Integer perimetro;

	Circulo() {
	};

	Circulo(Double Raio_) {
		this.raio = Raio_;
		System.out.printf("Resultado do area é %.2f \n", calcularArea());
	};

	Circulo(Double Raio_, Integer perimetro_) {
		this.raio = Raio_;
		this.perimetro = perimetro_;
		System.out.printf("Resultado do perimetro é %.2f \n", calcularPerimetro());
	};

	public Double getElevadoAoQuadrado(Double numero) {
		return numero * numero;
	}

	public Double calcularArea() {
		return Math.PI * getElevadoAoQuadrado(this.raio);
	}

	public Double calcularPerimetro() {
		return this.perimetro * Math.PI * this.raio;
	}

}
