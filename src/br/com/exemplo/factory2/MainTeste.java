package br.com.exemplo.factory2;

import br.com.exemplo.factory2.factory.iPhone11ProFactory;
import br.com.exemplo.factory2.factory.iPhoneFactory;
import br.com.exemplo.factory2.factory.iPhoneXFactory;

public class MainTeste {
	public static void main(String[] args) {
		
		iPhoneFactory iPhoneXFactory = new iPhoneXFactory();
		iPhoneXFactory.showiPhone();
		
		iPhoneFactory iPhone11ProFactory = new iPhone11ProFactory();
		iPhone11ProFactory.showiPhone();
		 
	}
}
