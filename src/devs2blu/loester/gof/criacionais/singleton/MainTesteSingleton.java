package devs2blu.loester.gof.criacionais.singleton;

public class MainTesteSingleton {

	public static void main(String[] args) {
		
		// Obtém a instância única do Singleton
		Singleton singletonInstance = Singleton.getInstance();

		// Usa a instância do Singleton
		singletonInstance.showMessage();
	}
	
}
