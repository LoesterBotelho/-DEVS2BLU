package br.com.exemplo.bridge3;

public class MainTeste {
	public static void main(String[] args) {
		
		Shape square = new Square(new Blue());
		System.out.println(square.draw());
		
		Shape circle = new Circle(new Red());
		System.out.println(circle.draw());
	}
}
