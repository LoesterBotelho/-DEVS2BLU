package br.com.exemplo.factory.exercicio01;

import br.com.exemplo.factory.exercicio01.factory.DocumentoFactory;
import br.com.exemplo.factory.exercicio01.factory.PDFFactory;
import br.com.exemplo.factory.exercicio01.factory.WordFactory;

public class MainTeste {
	public static void main(String[] args) {
		
		DocumentoFactory documentoWord = new WordFactory();
		documentoWord.abrir();
	
		DocumentoFactory documentoPDF = new PDFFactory();
		documentoPDF.abrir();		
		
	}
}
