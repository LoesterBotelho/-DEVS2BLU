package devs2blu.Aula09.Exerc09nv2.lo.Animal;

public class Cachorro extends Animal {
	
	@Override
	void comer() {
		System.out.println("Cachorro Comendo...");
	}
	
	@Override
	void emitirSom() {
		System.out.println("Cachorro Latindo...");
	}
	
    @Override
    Cachorro obterAnimal() {
        return new Cachorro();
    }

    
}
