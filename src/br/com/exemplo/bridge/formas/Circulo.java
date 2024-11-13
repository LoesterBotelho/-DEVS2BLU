package br.com.exemplo.bridge.formas;

import br.com.exemplo.bridge.cores.Cor;
import br.com.exemplo.bridge.estilos.Estilo;

public class Circulo extends Forma {
 public Circulo(Cor cor, Estilo estilo) {
     super(cor, estilo);
 }

 @Override
 public void desenhar() {
     System.out.print("Desenhando um círculo com ");
     cor.aplicarCor();
     estilo.aplicarEstilo();   
     System.out.printf("\n");
 }
}