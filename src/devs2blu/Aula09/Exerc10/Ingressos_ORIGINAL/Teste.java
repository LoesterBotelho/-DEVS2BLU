/*
 * Autor : Loester Franco Botelho - JAVA
 */

package devs2blu.Aula09.Exerc10.Ingressos_ORIGINAL;

public class Teste {

	public static void main(String[] args) {
		
		imprimirAutor();
		
		IngressoNormal ingresso01 = new IngressoNormal();
		ingresso01.mostrar();
		
		IngressoVIP ingresso02 = new IngressoVIP();
		ingresso02.mostrar();
		
		IngressoCamaroteInferior ingresso03 = new IngressoCamaroteInferior();
		ingresso03.mostrar();

		IngressoCamaroteSuperior ingresso04 = new IngressoCamaroteSuperior();
		ingresso04.mostrar();
		
		
	}
	
	public static void imprimirAutor() {
		System.out.printf("Autor : Loester Botelho - Java \n");
		System.out.printf("............................................ \n\n");
	} 	
}
