package devs2blu.Aula09.Exerc09nv2.lo.Animal;

public class Gato extends Animal {

	@Override
	void comer() {
		System.out.println("Gato Comendo...");
	}
	
	@Override
	void emitirSom() {
		System.out.println("Gato Latindo...");
	}
	
    @Override
    Gato obterAnimal() {
        return new Gato();
    }
    
}
