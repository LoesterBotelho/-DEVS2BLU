package br.com.exemplo.factory.contabil.factory;

import br.com.exemplo.factory.contabil.model.Documento;

public abstract class DocumentoFactory {
	public abstract Documento createDocumento();
	
	public void contabilizar() {
		Documento documento = createDocumento();
		documento.contabilizar();
	}
	
}
