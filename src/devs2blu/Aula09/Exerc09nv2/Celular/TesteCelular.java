/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc09nv2.Celular;

public class TesteCelular {

	public static void main(String[] args) {
		imprimirAutor();
		
		
        BateriaImpl bateria = new BateriaImpl(1000);
        CelularImpl celular = new CelularImpl(bateria);

        celular.ligar();
        celular.usarCelular(200); 
        celular.ligar();

        bateria.carregar();
        celular.ligar();
        
        celular.usarCelular(1000);
        celular.ligar();
        
        bateria.carregar();
        celular.ligar();
        
	}
	
	public static void imprimirAutor() {
		System.out.printf("Autor : Loester Botelho - Java \n");
		System.out.printf("............................................ \n");
	}  
	
}
