package br.com.exemplo.bridge.formas;

import br.com.exemplo.bridge.cores.Cor;
import br.com.exemplo.bridge.estilos.Estilo;

public abstract class Forma {
 protected Cor cor;
 protected Estilo estilo;
 
 protected Forma(Cor cor, Estilo estilo) {
     this.cor = cor;
     this.estilo = estilo;
 }

public abstract void desenhar();
}
