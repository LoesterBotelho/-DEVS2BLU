package devs2blu.loester.gof.criacionais.factory;

public abstract class TransporteFactory {
	
    public abstract Transporte criarTransporte();

    public void fazerEntrega() {
        Transporte transporte = criarTransporte();
        transporte.entregar();
    }
    
}
