package devs2blu.interfaces.lo;

public class Cachorro implements Animal {

	
	Cachorro(){
		
	}
	
	@Override
	public void comer() {
		System.out.println("Cachorro está Comendo...");

	}

	@Override
	public void dormir() {
		System.out.println("Cachorro está Dormindo...");
	}

}
