package devs2blu.Aula14.Solid.LO.OCP2;

public class Main {
	public static void main(String[] args) {
		
		// Testando com um Retângulo
		Rectangle rectangle = new Rectangle(10, 5);
		System.out.println("Rectangle width: " + rectangle.getWidth() );
		System.out.println("Rectangle height: " + rectangle.getHeight() );
		System.out.println("");
		
		// Alterando as dimensões do Retângulo
		rectangle.setWidth(20);
		rectangle.setHeight(10);
		System.out.println("Updated Rectangle width: " + rectangle.getWidth() );
		System.out.println("Updated Rectangle height: " + rectangle.getHeight() );
		System.out.println("");
		
		// Testando com um Quadrado
		Square square = new Square(5);
		System.out.println("Square side length: " + square.getWidth() ); // Pode usar getWidth ou getHeight
		System.out.println("");
		
		// Alterando o lado do Quadrado
		square.setSideLength(10);
		System.out.println("Updated Square side length: " + square.getWidth() );
		System.out.println("");
		
	}
}
