package br.com.exemplo.factory.exercicio01.factory;

import br.com.exemplo.factory.exercicio01.model.Documento;
import br.com.exemplo.factory.exercicio01.model.Word;

public class WordFactory extends DocumentoFactory {

	@Override
	public Documento createDocumento() {
		return new Word();
	}

}
