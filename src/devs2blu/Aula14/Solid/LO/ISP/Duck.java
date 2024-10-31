package devs2blu.Aula14.Solid.LO.ISP;

public class Duck implements Flyable, Swimmable {
	@Override
	public void fly() {
		System.out.println("O pato está voando.");
	}

	@Override
	public void swim() {
		System.out.println("O pato está nadando.");
	}
}