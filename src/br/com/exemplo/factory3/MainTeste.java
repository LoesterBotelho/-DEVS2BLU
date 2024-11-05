package br.com.exemplo.factory3;

import br.com.exemplo.factory3.factory.BicicletaFactory;
import br.com.exemplo.factory3.factory.CarroFactory;
import br.com.exemplo.factory3.factory.MotoFactory;
import br.com.exemplo.factory3.factory.TransporteFactory;

public class MainTeste {

	public static void main(String[] args) {
		
		TransporteFactory bicicletaFactory = new BicicletaFactory();
		bicicletaFactory.fazerEntrega();
		
		TransporteFactory motoFactory = new MotoFactory();
		motoFactory.fazerEntrega();
		              
		TransporteFactory carroFactory = new CarroFactory();
		carroFactory.fazerEntrega();
		
	}
}
