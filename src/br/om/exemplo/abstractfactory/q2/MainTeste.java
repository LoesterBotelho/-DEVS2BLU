package br.om.exemplo.abstractfactory.q2;

import br.om.exemplo.abstractfactory.q2.factory.HTMLFactory;
import br.om.exemplo.abstractfactory.q2.factory.PDFFactory;
import br.om.exemplo.abstractfactory.q2.factory.SimplesFactory;
import br.om.exemplo.abstractfactory.q2.model.Grafico;
import br.om.exemplo.abstractfactory.q2.model.Relatorio;

public class MainTeste {
	public static void main(String[] args) {
	        
	        String[] formatos = {"PDF" , "HTML"};
	        	        
	        for (var item : formatos) {
		        
	        	SimplesFactory factory = null;
		        
		        if ("PDF".equals(item)) {
		            factory = new PDFFactory();
		        } else if ("HTML".equals(item)) {
		            factory = new HTMLFactory();
		        } else {
		            System.out.println("Formato não suportado!");
		        }
		        
		        Relatorio relatorio = factory.createRelatorio();
		        Grafico grafico = factory.createGrafico();

		        relatorio.gerarRelatorio();
		        grafico.gerarGrafico();
		        
	        }



	        
	}
}
