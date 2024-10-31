package devs2blu.Aula14.Solid.LO.LSP;

public class Ostrich extends Bird {

	// Ostrich não voa, então não deve herdar de Bird
	@Override
	public void fly() {
		System.out.println("Avestruzes não podem voar!");
		// throw new UnsupportedOperationException("Avestruzes não podem voar!");
	}
}