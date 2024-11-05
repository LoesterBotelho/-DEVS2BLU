package br.com.exemplo.factory.exercicio01.factory;

import br.com.exemplo.factory.exercicio01.model.Documento;

public abstract class DocumentoFactory {
	
	public abstract Documento createDocumento();

	public void abrir() {
		Documento documento = createDocumento();
		documento.abrir();
	}
	
}
