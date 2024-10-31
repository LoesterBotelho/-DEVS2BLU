package devs2blu.Aula14.Solid.LO.OCP;

public class Main {

	public static void main(String[] args) {
		
		Shape circulo = new Circle(10.0);
		Shape quadrado = new Quadrado(10.0);
		Shape retangulo = new Rectangle(10.0, 5.0);

		System.out.printf("SHAPE - CIRCULO - AREA : %s \n", circulo.area());
		System.out.printf("SHAPE - QUADRADO - AREA : %s \n", quadrado.area());
		System.out.printf("SHAPE - RETANGULO - AREA : %s \n", retangulo.area());

	}

}
