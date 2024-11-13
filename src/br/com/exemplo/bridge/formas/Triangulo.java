package br.com.exemplo.bridge.formas;

import br.com.exemplo.bridge.cores.Cor;
import br.com.exemplo.bridge.estilos.Estilo;

public class Triangulo extends Forma {
	 public Triangulo(Cor cor, Estilo estilo) {
	     super(cor, estilo);
	 }

	 @Override
	 public void desenhar() {
	     System.out.print("Desenhando um triangulo com ");
	     cor.aplicarCor();
	     estilo.aplicarEstilo();
	     System.out.printf("\n");
	 }
	}