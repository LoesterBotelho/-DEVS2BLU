package br.com.exemplo.bridge;

import br.com.exemplo.bridge.cores.Azul;
import br.com.exemplo.bridge.cores.Verde;
import br.com.exemplo.bridge.cores.Vermelho;
import br.com.exemplo.bridge.estilos.Solido;
import br.com.exemplo.bridge.estilos.Tracejado;
import br.com.exemplo.bridge.formas.Circulo;
import br.com.exemplo.bridge.formas.Forma;
import br.com.exemplo.bridge.formas.Quadrado;
import br.com.exemplo.bridge.formas.Triangulo;

public class MainTeste {

	public static void main(String[] args) {
		Forma circuloVermelho = new Circulo(new Vermelho(), new Solido());
		circuloVermelho.desenhar();
		
		Forma quadradoAzul = new Quadrado(new Azul(), new Tracejado());
		quadradoAzul.desenhar();

		Forma circuloVerde = new Circulo(new Verde(), new Solido());
		circuloVerde.desenhar();

		Forma quadradoVerde = new Quadrado(new Verde(), new Tracejado());
		quadradoVerde.desenhar();

		Forma trianguloVerde = new Triangulo(new Verde(), new Tracejado());
		trianguloVerde.desenhar();
	}

}
