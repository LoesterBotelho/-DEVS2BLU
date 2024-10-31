package devs2blu.interfaces.lo;

public interface Animal {
	
	void comer();
	void dormir();
	
	
    // Método default
    default void fazerSom() {
        System.out.println("O animal está fazendo um som.");
    }

    // Método estático
    static void info() {
        System.out.println("Animais são seres vivos.");
    }
    
}