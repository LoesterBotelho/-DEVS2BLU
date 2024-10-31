package devs2blu.loester.gof.criacionais.singleton;

public class Singleton {
	
    // Instância única da classe
    private static Singleton instance;

    // Construtor privado para impedir instanciamento
    private Singleton() {}

    // Método para obter a instância única da classe
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    // Método de exemplo para mostrar o funcionamento
    public void showMessage() {
        System.out.println("Hello from Singleton!");
    }
}
