package devs2blu.Aula14.Solid.LO.OCP;

//Extensão da classe base
public class Rectangle implements Shape {
	private double width;
	private double height;

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	@Override
	public double area() {
		return width * height;
	}
}