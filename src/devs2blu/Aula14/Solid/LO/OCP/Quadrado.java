package devs2blu.Aula14.Solid.LO.OCP;

public class Quadrado implements Shape {
	private double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public double area() {
		return lado * lado;
	}
}
