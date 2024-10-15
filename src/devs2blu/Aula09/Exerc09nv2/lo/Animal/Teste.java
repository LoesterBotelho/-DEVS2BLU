package devs2blu.Aula09.Exerc09nv2.lo.Animal;

public class Teste {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro();
		cachorro.comer();
		cachorro.emitirSom();
		
		System.out.println( cachorro.obterAnimal() );
		
	
		Gato gato = new Gato();
		gato.comer();
		gato.emitirSom();		
		
		System.out.println( gato.obterAnimal() );

	}

}
