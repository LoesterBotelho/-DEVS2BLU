package devs2blu.Aula07.Modulo5;

public class CirculoTeste {

	public static void main(String[] args) {

		Circulo c1 = new Circulo(12.0);
		c1.calcularArea();
		c1.calcularPerimetro();
		
		Circulo c2 = new Circulo(5.0 , 2);
		c2.calcularArea();
		c1.calcularPerimetro();
	}

}
