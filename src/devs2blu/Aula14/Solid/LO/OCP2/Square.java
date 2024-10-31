package devs2blu.Aula14.Solid.LO.OCP2;

//Implementação de um Quadrado que quebra o LSP
public class Square implements Quadrilateral {
	private double sideLength;

	public Square(double sideLength) {
		this.sideLength = sideLength;
	}

	@Override
	public double getWidth() {
		return sideLength;
	}

	@Override
	public double getHeight() {
		return sideLength;
	}

	public void setSideLength(double sideLength) {
		this.sideLength = sideLength;
	}
}